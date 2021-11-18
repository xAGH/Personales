//promesa que depende de un settimeout
let controlador = false;
let promesaSetTimeOut = new Promise((resolve, reject) => {
    function trigger() {
        if (controlador){
            resolve("Promesa settimeout resuelta")
        }
        reject("Promesa rechazada")
        
    }
    setTimeout(trigger, 3000);
})
promesaSetTimeOut.then((res)=> {
    console.log(res);
}).catch((error) => {
    console.log(error);
})