let promesa_then_encadenado = new Promise((resolve, reject) => {
    resolve("A");
})

promesa_then_encadenado.then((res) => {
    console.log(res);
    return res;
}).then((res:any) => {
    console.log(res);
    return res + "D";
}).then((res:any) => {
    return res + "S";
}).then((res:any) => {
    return res + "I" ;
}).then((res:any) => {
    console.log(res);
}).catch((error) => {
    //catch se ejecutará si ocurre un error en alguno de los .then encadenados
    console.log(error);
})