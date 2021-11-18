let estrato_civil : number = 2;

const promesa3: Promise<string> = new Promise<string>((resolve, reject) => {
    
    if (estrato_civil > 0 && estrato_civil < 7){

        if (estrato_civil > 0 && estrato_civil < 3){
            resolve("El usuario tiene derecho a un subsidio.");
        } 
        
        else{
            resolve("El usuario no tiene derecho a un subsidio.")
        }
    } 

    else{
        reject("Estrato no válido.")
    }
});

promesa3.then((resolve) => {
            console.log(resolve);
        }).catch((err) => {
            console.error(err)
        })