/*DNAStrand ("ATTGC") -> "TAACG"
DNAStrand ("GTAT") -> "CATA"*/

const complet = {
	"A" : "T",
	"T" : "A",
	"C" : "G",
	"G" : "C",
};

function remplacement (chaine){
	console.log(chaine.replaceAll(/T|C|A|G/g, match => complet[match]));
}

remplacement("ATTGC");
remplacement ("GTAT")