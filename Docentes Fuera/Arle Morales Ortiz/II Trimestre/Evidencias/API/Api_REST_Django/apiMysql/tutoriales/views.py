from django.shortcuts import render

from django.http.response import JsonResponse
from rest_framework.parsers import JSONParser 
from rest_framework import status
 
from tutoriales.models import Tutorial
from tutoriales.serializers import TutorialSerializer
from rest_framework.decorators import api_view


@api_view(['GET', 'POST', 'DELETE'])
def tutorial_lista(request):
    # obtiene lista de tutoriales, POST a un nuevo tutorial, DELETE todos los tutoriales
    if request.method == 'GET':
            tutoriales = Tutorial.objects.all()
            
            titulo = request.GET.get('titulo', None)
            if titulo is not None:
                tutoriales = tutoriales.filter(titulo__icontains=titulo)
            
            tutoriales_serializer = TutorialSerializer(tutoriales, many=True)
            return JsonResponse(tutoriales_serializer.data, safe=False)

    elif request.method == 'POST':
            tutorial_data = JSONParser().parse(request)
            tutorial_serializer = TutorialSerializer(data=tutorial_data)
            if tutorial_serializer.is_valid():
                tutorial_serializer.save()
                return JsonResponse(tutorial_serializer.data, status=status.HTTP_201_CREATED) 
            return JsonResponse(tutorial_serializer.errors, status=status.HTTP_400_BAD_REQUEST)  

    elif request.method == 'DELETE':
            count = Tutorial.objects.all().delete()
            return JsonResponse({'message': '{} el Tutorial eliminado Satisfactoriamente!'.format(count[0])}, status=status.HTTP_204_NO_CONTENT)

@api_view(['GET', 'PUT', 'DELETE'])
def tutorial_detalle(request, pk):
    # encuentra tutorial por pk (id)
    try: 
        tutorial = Tutorial.objects.get(pk=pk) 
    except Tutorial.DoesNotExist: 
        return JsonResponse({'message': 'Tutorial no existe!'}, status=status.HTTP_404_NOT_FOUND) 

    if request.method == 'GET': 
        tutorial_serializer = TutorialSerializer(tutorial) 
        return JsonResponse(tutorial_serializer.data) 
    elif request.method == 'PUT': 
        tutorial_data = JSONParser().parse(request) 
        tutorial_serializer = TutorialSerializer(tutorial, data=tutorial_data) 
        if tutorial_serializer.is_valid(): 
            tutorial_serializer.save() 
            return JsonResponse(tutorial_serializer.data) 

    elif request.method == 'DELETE': 
        tutorial.delete() 
        return JsonResponse({'message': 'Tutorial ha sido borrado!'}, status=status.HTTP_204_NO_CONTENT)
    # GET / PUT / DELETE tutorial
    
        
@api_view(['GET'])
def tutorial_list_publicado(request):
    # obtiene listado de tutoriales publicados
    tutoriales = Tutorial.objects.filter(publicado=True)
        
    if request.method == 'GET': 
        tutoriales_serializer = TutorialSerializer(tutoriales, many=True)
        return JsonResponse(tutoriales_serializer.data, safe=False)



        