package pacTeste;

public class TesteSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strAssunto = "$[0]=assuntoP1;$[1]=assuntoP2;$[2]=assuntoP3;$[3]=assuntoP4";
//		String strAssunto = "Segue teste de envio de E-mail Tipo 2 \n Autor: Bruno Moreira Santos";
		
		String pedaco = trataAssunto(strAssunto);

	}
    
    public static String trataAssunto(String varAssunto) {
    	
    	String arraySplit1[] = varAssunto.split("\\$\\[");
    	
    	int indexParm = 0;
    	
    	String arrayIndex[] = new String[arraySplit1.length];
    	String arrayTexto[] = new String[arraySplit1.length];
    	
    	for (int i = 0; i < arraySplit1.length; i++) {
			String itemSplit1 = arraySplit1[i];
	    	String arraySplit2[] = itemSplit1.split("\\]\\=");
	    	indexParm = splitIterativoNivelDois(arraySplit2, ";", indexParm, arrayIndex, arrayTexto);
		}
    	
    	return "";
    }
//
//    private static void splitIterativoNivelUm(String pArray[], String delimitador) {
//    	
//    	for (int i = 0; i < pArray.length; i++) {
//			String itemSplit = pArray[i];
//			String arrayRetorno[] = itemSplit.split(delimitador);
//			splitIterativoNivelDois(arrayRetorno, ";");
//		}
//    	
//    }

    private static int splitIterativoNivelDois(String pArray[], String pDelimitador, int indexParm, String pArrayIndex[], String pArrayTexto[]) {
    	String arrayWork[] = null;
    	
    	for (int i = 0; i < pArray.length; i++) {
			String itemSplit = pArray[i];
			if (itemSplit.contains(";")) {
				arrayWork = itemSplit.split(pDelimitador);
				pArrayTexto[indexParm] = arrayWork[0];
				indexParm++;
			} else {
				pArrayIndex[indexParm] = itemSplit;
			}
		}
    	
    	return indexParm;
    	
    }
}
