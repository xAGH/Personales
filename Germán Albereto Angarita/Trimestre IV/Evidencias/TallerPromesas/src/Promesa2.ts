const promesa2: Promise<any> = Promise.reject("Ha ocurrido un error desconocido.")

promesa2.catch(err => {
    console.error(err)
})  