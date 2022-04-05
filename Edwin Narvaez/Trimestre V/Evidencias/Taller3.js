function PrimeraPunto() {
    ENUNCIADO = "Insertar la información de 8 instructores del centro, la cual incluya"
                "nombre (requerido de tipo string), dni (requerido, tipo entero)" 
                "y un arreglo habilidades que contenga al menos dos valores. "

    // Creacion del schema con validacion de docentes
    db.createCollection("docentes", {
        validator: {
            $jsonSchema: {
                bsonType: "object",
                // Indicamos los campos requeridos
                required: ["nombre", "dni", "habilidades"],
                properties: {
                    // Indicamos las propiedades de cada campo
                    nombre: {
                        bsonType: "string"
                    },
                    dni: {
                        bsonType: "int"
                    },
                    habilidades: {
                        bsonType: "array",
                        minItems: 2
                    }
                }
            }
        }
    })

    // Insercion de docentes 
    db.docentes.insertMany(
        [
            {
                nombre: "Edwin N",
                dni: 1,
                habilidades: ["MongoDB", "PHP"]
            },
            {
                nombre: "Cristian",
                dni: 2,
                habilidades: ["Java", "Kotlin"]
            },
            {
                nombre: "German",
                dni: 3,
                habilidades: ["Flask", "Angular"]
            },
            {
                nombre: "Edwin R",
                dni: 4,
                habilidades: ["Java", "Android"]
            },
            {
                nombre: "Henry",
                dni: 5,
                habilidades: ["HTML", "CSS"]
            },
            {
                nombre: "Luisa",
                dni: 6,
                habilidades: ["Ingles", "Redaccion"]
            },
            {
                nombre: "Hugo",
                dni: 7,
                habilidades: ["C#", "Python"]
            },
            {
                nombre: "Oscar",
                dni: 8,
                habilidades: ["MySQL", "Documentacion"]
            }
        ]
    )

    // Resultado de la inserción anterior
    RETORNA = {
        acknowledged: true,
        insertedIds: {
            '0': ObjectId("624b0208ee2a86d3df2e90b4"),
            '1': ObjectId("624b0208ee2a86d3df2e90b5"),
            '2': ObjectId("624b0208ee2a86d3df2e90b6"),
            '3': ObjectId("624b0208ee2a86d3df2e90b7"),
            '4': ObjectId("624b0208ee2a86d3df2e90b8"),
            '5': ObjectId("624b0208ee2a86d3df2e90b9"),
            '6': ObjectId("624b0208ee2a86d3df2e90ba"),
            '7': ObjectId("624b0208ee2a86d3df2e90bb")
        }
    }
}

function SegundaPunto() {
    ENUNCIADO = "Insertar la información de almenos 5 cursos, los cuales deben incluir nombre"
                "descripción y la relación del docente que dicta dicho curso"

    // Creacion del schema con validacion de cursos
    db.createCollection("cursos", {
        validator: {
            $jsonSchema: {
                bsonType: "object",
                // Indicamos los campos requeridos
                required: ["nombre", "descripcion", "docente"],
                // Indicamos las propiedades de cada campo
                properties: {
                    nombre: {
                        bsonType: "string"
                    },
                    descripcion: {
                        bsonType: "string"
                    },
                    docente: {
                        bsonType: "int",
                    }
                }
            }
        }
    })

    // Insercion de cursos 
    db.cursos.insertMany(
        [
            {
                nombre: "MongoDB",
                descripcion: "Base de datos NoSQL",
                docente: 1
            },
            {
                nombre: "PHP",
                descripcion: "Lenguaje de alto nivel, buena integración con HTML",
                docente: 2
            },
            {
                nombre: "Python",
                descripcion: "Lenguaje de alto nivel, facil sintaxis y facil de aprender",
                docente: 3
            },
            {
                nombre: "Kotlin",
                descripcion: "Lenguaje de alto nivel, utilizado para aplicaciones móviles.",
                docente: 4
            },
            {
                nombre: "C#",
                descripcion: "Lenguaje de alto nivel, se utiliza para la creacion de WindowsForms",
                docente: 5
            }
        ]
    )
    
    // Resultado de la inserción anterior
    RETORNA = {
        acknowledged: true,
        insertedIds: {
            '0': ObjectId("624b0236ee2a86d3df2e90bc"),
            '1': ObjectId("624b0236ee2a86d3df2e90bd"),
            '2': ObjectId("624b0236ee2a86d3df2e90be"),
            '3': ObjectId("624b0236ee2a86d3df2e90bf"),
            '4': ObjectId("624b0236ee2a86d3df2e90c0")
        }
    }
}

function TercerPunto() {
    ENUNCIADO = "Crear un índice denominado índice_nombre sobre el campo nombre del instructor"

    // Creacion de indice para la tabla de docentes
    db.docentes.createIndex(
        {
            nombre: 1
        },
        {
            name: "indice_nombre"
        }
    )

    // Resultado de la anteior sentencia
    RETORNA = indice_nombre

    // Comrpobacion de que se creo el indice
    COMPROBACION = db.docentes.getIndexes()
    [
        { v: 2, key: { _id: 1 }, name: '_id_', ns: 'taller3.docentes' },
        {
            v: 2,
            key: { nombre: 1 },
            name: 'indice_nombre',
            ns: 'taller3.docentes'
        }
    ]
}

function CuartoPunto() {
    ENUNCIADO = "Mostrar el resultado de la ejecución que realiza Mongo en la base de datos"
                "al llevar a cabo una consulta buscando por el nombre de un instructor."

    // Busqueda de un documento filtrado por nombre mostrando las estadisticas de ejecucion
    db.docentes.find(
        {
            nombre: "Edwin N"
        }
    ).explain("executionStats")

    // Resultado de la anteior sentencia
    RETORNA = {
        queryPlanner: {
            plannerVersion: 1,
            namespace: 'taller3.docentes',
            indexFilterSet: false,
            parsedQuery: { nombre: { '$eq': 'Edwin N' } },
            winningPlan: {
                stage: 'FETCH',
                inputStage: {
                    stage: 'IXSCAN',
                    keyPattern: { nombre: 1 },
                    indexName: 'indice_nombre',
                    isMultiKey: false,
                    multiKeyPaths: { nombre: [] },
                    isUnique: false,
                    isSparse: false,
                    isPartial: false,
                    indexVersion: 2,
                    direction: 'forward',
                    indexBounds: { nombre: ['["Edwin N", "Edwin N"]'] }
                }
            },
            rejectedPlans: []
        },
        executionStats: {
            executionSuccess: true,
            nReturned: 1,
            executionTimeMillis: 0,
            totalKeysExamined: 1,
            totalDocsExamined: 1,
            executionStages: {
                stage: 'FETCH',
                nReturned: 1,
                executionTimeMillisEstimate: 0,
                works: 2,
                advanced: 1,
                needTime: 0,
                needYield: 0,
                saveState: 0,
                restoreState: 0,
                isEOF: 1,
                invalidates: 0,
                docsExamined: 1,
                alreadyHasObj: 0,
                inputStage: {
                    stage: 'IXSCAN',
                    nReturned: 1,
                    executionTimeMillisEstimate: 0,
                    works: 2,
                    advanced: 1,
                    needTime: 0,
                    needYield: 0,
                    saveState: 0,
                    restoreState: 0,
                    isEOF: 1,
                    invalidates: 0,
                    keyPattern: { nombre: 1 },
                    indexName: 'indice_nombre',
                    isMultiKey: false,
                    multiKeyPaths: { nombre: [] },
                    isUnique: false,
                    isSparse: false,
                    isPartial: false,
                    indexVersion: 2,
                    direction: 'forward',
                    indexBounds: { nombre: ['["Edwin N", "Edwin N"]'] },
                    keysExamined: 1,
                    seeks: 1,
                    dupsTested: 0,
                    dupsDropped: 0,
                    seenInvalidated: 0
                }
            }
        },
        serverInfo: {
            host: 'alejo-PC',
            port: 27017,
            version: '3.6.8',
            gitVersion: '8e540c0b6db93ce994cc548f000900bdc740f80a'
        },
        ok: 1
    }
}

function QuintoPunto() {
    ENUNCIADO = "Crear un cursor que permita navegar entre los docs de la colección"
                "y permita mostrar el nombre del curso que dicta un instructor específico."

    // Creacion del cursor
    var cursos = db.cursos.find();
    // Iteracion de los resultados del cursor
    while (cursos.hasNext()) {
        // Obtencion del objeto en la actual itertacion
        var curso = cursos.next();
        // Comparacion de un atributo del objeto con 1 
        if (curso.docente == 1) {
            // SI la comprobacion es verdadera, imrpime el docente encontrado
            print(db.docentes.find({ habilidades: curso.nombre }));
            break;
        }
    }

    // Resultado de la anteior setencia
    RETORNA = [
        {
            _id: ObjectId("624b0208ee2a86d3df2e90b4"),
            nombre: 'Edwin N',
            dni: 1,
            habilidades: ['MongoDB', 'PHP']
        }
    ]
}
