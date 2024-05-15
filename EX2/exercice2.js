/*maskify('4556364607935616') -> '############5616'
maskify('1') -> '1'
maskify('11111') -> '#1111'*/

function maskify(str) {
	const derNum = str.slice(-4);
	const numCache = "#".repeat(str.length);
	
	return numCache + derNum;
	
}

console.log(maskify('4556364607935616'));
console.log(maskify('1'));
console.log(maskify('11111'));