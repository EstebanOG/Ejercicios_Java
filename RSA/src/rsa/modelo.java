package rsa;

public class modelo extends modelo_abstract implements modelo_interface{
    
    @Override
    public void calcula(){
        leer_variables();       
        calcula_s_z();
        recorre_array();
        for(i=0;i<palabra.length();i++)
        {
            bits();
            ASCII();
            encriptado();    
        }
        //desencriptado();
        
    }
    
    @Override
    public void recorre_array(){
        letras = palabra.toCharArray();
    }
    
    @Override 
    public void calcula_s_z(){
        fi=(p-1)*(q-1);
        z = p * q;
        while((n * s) % fi != 1){
            s=s+1;
        }
        clavePrivada=s;
    }
    
    @Override
    public void ASCII(){
        for (int x=0;x<palabra.length();x++){
            arregloASCII[x] = palabra.codePointAt(x);
            arregloletras[x]= palabra.charAt(x);
            //System.out.println(palabra.charAt(x) + " = " + palabra.codePointAt(x));;   
        }       
    }
    
    @Override
    public void bits(){
        //System.out.println(Integer.toBinaryString(n));
        while(n > 0) {
        if(n % 2 != 0) {
            arreglo[k] = 1;
        }else{
            arreglo[k] = 0;
        }
        k++; // para acceder el arreglo a[]
        n = n >> 1; // para acceder al próximo bit
        }
    }
    
    @Override
    public void encriptado(){
        int []arreglo2 = new int[k];
        arreglo2[0]=arregloASCII[ascii];
        for(int j=1; j<k; j++){
            arreglo2[j]=((( arreglo2[j-1]) % z)*((arreglo2[j-1]) % z)) % z;
        }
        int j=0;
        while(j<k)
        {
            if(arreglo[j] == 1){
                if(j == 0)
                {
                    numencriptado = arreglo2[j];
                }
                else{
                    numencriptado = (numencriptado * arreglo2[j])%z;
                }
            }else{
                
            }
            j++;
        }
        System.out.println(arregloletras[ascii] + " = "+numencriptado);
        ascii++;
    }
    
    @Override
    public void desencriptado(){
        System.out.println("Desencriptando.....");
        System.out.println(z);
        System.out.println("Valor: "+numencriptado);
        System.out.println(clavePrivada);
        bitsS();
       /* while((bitsS * clavePrivada) % fi != 1){
            clavePrivada=clavePrivada+1;
        }
       /* int []arreglodesen = new int[k];
        arreglodesen[0]=arregloASCII[ascii];
        for(int j=1; j<k; j++){
            arreglodesen[j]=((( arreglodesen[j-1]) % z)*((arreglodesen[j-1]) % z)) % z;
        }
        int j=0;
        while(j<k)
        {
            if(arreglo[j] == 1){
                if(j == 0)
                {
                    numencriptado = arreglodesen[j];
                }
                else{
                    numencriptado = (numencriptado * arreglo2[j])%z;
                }
            }else{
                
            }
            j++;
        }
        System.out.println(arregloletras[ascii] + " = "+numencriptado);
        ascii++;
        */
    }
    
    @Override
    public void bitsS(){
        //System.out.println(Integer.toBinaryString(s));
        while(clavePrivada > 0) {
        if(clavePrivada % 2 != 0) {
            arreglobitsS[bitsS] = 1;
        }else{
            arreglobitsS[bitsS] = 0;
        }
        bitsS++; // para acceder el arreglo a[]
        clavePrivada = clavePrivada >> 1; // para acceder al próximo bit
        }
        System.out.println(bitsS+" + "+clavePrivada+" + "+fi);
        while((bitsS * clavePrivada) % fi != 1){
            System.out.println(clavePrivada);
            clavePrivada = clavePrivada + 1;
        }
        System.out.println("Acá3");
        
        //n=bitsS;        
    }
    @Override
    public void leer_variables(){
        p=controlador.p;
        q=controlador.q;
        n=controlador.n;
        palabra=controlador.palabra;
    }
    
}
