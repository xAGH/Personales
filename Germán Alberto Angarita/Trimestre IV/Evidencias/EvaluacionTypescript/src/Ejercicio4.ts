function funcionAsincrona(): Promise<string> {
    return new Promise<string>((resolve, reject) => {
        function pendiente(): void {
            resolve("SOMOS ADSI");
        }
        setTimeout(pendiente, 2000);
    })
}

let llamadoAsincrono = async() => {
    console.log(await funcionAsincrona());
}

llamadoAsincrono();
