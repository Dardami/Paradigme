//number1([[10,0],[3,5],[5,8]])
//number2([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]])
//number3([[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]]) 


function nbdsbus(variable){
	return variable.reduce((nbprs, arret) => {
		const [entre , sortie] = arret;
		return nbprs + entre - sortie;
	}, 0 );
	
}

console.log(nbdsbus([[10,0],[3,5],[5,8]]));
console.log(nbdsbus([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]]));
console.log(nbdsbus([[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]]));