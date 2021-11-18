const promesa = new Promise ( (resolve:Function, reject:Function) =>{
	if(true){
		setTimeout( ()=>{
			resolve('Todo correcto')
		}, 2000)
	}else{
		reject(Error('Algo ha sucedido.'))
	}
})

promesa
	.then( (resolve) => {
		console.log(resolve)
	}).catch( (error) => {
		console.log(error)		
	})
