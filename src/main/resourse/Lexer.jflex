
package lexico;
%%

/*segunda seccion: configuracion*/


%class CounterLexer
%public
%unicode
%line
%column
%int
 
%{
	private int vocal =0 ;
	private int cantEnteros =0 ;
	private int fila =0 ;
	private int columna =0 ;
	private int v1, v2 , v3,v4,v5= 0;
	private String enteros ="";
	private String enterosLista ="";
	
	
	private void contarVocal(){
		if(vocal==1){
		
			v1++;	
		}else if(vocal==2){
		
			v2++;	
		}else if(vocal==3){
	
			v3++;	
		}else if(vocal==4){
	
			v4++;	
		}else if(vocal==5){
		
			v5++;	
		}
		vocal=0;
	}
	
	 public int getV1() {
        	return v1;
   	 }

    	public int getV2() {
        return v2;
   	 }

    	public int getV3() {
        return v3;
    	}

    	public int getV4() {
        return v4;
    	}

   	 public int getV5() {
        return v5;
    	}
    	
    	public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
    	
    	private void contarEnteros(){
    		System.out.println("Total enteros" );
    		cantEnteros=0;
    	}
    
	
%}
%eof{
	System.out.println("v1-"+v1+" v2-"+v2+" v3-"+v3 +" --->Enteros cant "+cantEnteros +"   "+enterosLista );
	contarVocal();
%eof}
%%
\s {contarVocal();}
(a|e|i|o|u)|(A|E|I|O|U) {vocal++;}
[0-9]+ {cantEnteros++;fila = yyline; columna = yycolumn; }
[^]				{}


