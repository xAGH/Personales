const promesa2: Promise<String> = new Promise<String>((resolve, reject) => {
    reject(new Error("Ha ocurrido un error desconocido."))
})

promesa2
    .catch((err) => {
        console.error(err)
    })