const promesa1: Promise<string> = Promise.resolve("Somos programadores, movemos al mundo.")

promesa1.then(res => {
    console.log(res)
})