const promesa1: Promise<String> = new Promise<String>((resolve) => {
    resolve("Somos programadores, movemos al mundo.");
})

promesa1.
    then((resolve) => {
        console.log(resolve)
    }).catch((err) => {
        console.log(err)
    })