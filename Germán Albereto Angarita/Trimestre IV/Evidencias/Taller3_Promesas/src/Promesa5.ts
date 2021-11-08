
let cumplirP2: boolean = false;

const p1: Promise<string> = Promise.resolve("Somos ADSI.");

const p2: Promise<string> = new Promise((resolve, reject) => {
    if (cumplirP2){
        resolve("Somos programadores.");
    }

    else{
        reject(Error("Promesa 2 no cumplida."))
    }
})

const p3: Promise<string> = Promise.resolve("Hacemos mover el mundo.")

p1.then(res => {
    console.log(res);
    p2.then(res => {
        console.log(res);
        p3.then(res => {
            console.log(res)
        })
    }).catch(err => {
        console.error(err.message);
        p3.then(res => {
            console.log(res)
        })
    })
})