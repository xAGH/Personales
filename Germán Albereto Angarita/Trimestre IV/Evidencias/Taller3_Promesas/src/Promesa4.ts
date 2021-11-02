const promesa4: Promise<number> = Promise.resolve(2);

promesa4
    .then(res => res * res)
    .then(res => res * res)
    .then(res => res * res)
    .then(x => console.log(x));