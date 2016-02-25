
package practica1;

import java.util.Scanner;

public class Competencia {

    private Scanner teclado;
    
    
    String Nombre,Rama;
    int Fecha, Documento;
    char cat;
    int cont=0;
    Gestion Nadador[] = new Gestion[100];
    
    public Competencia(){
        teclado = new Scanner(System.in);
        int opc=0;
        while(opc!=3){
            System.out.println("MENU");
            System.out.println("1. Datos deportistas");
            System.out.println("2. Pruebas");
            System.out.println("3. Salir");
            opc=teclado.nextInt();
            switch(opc){
                case 1:
                    int opc1=0;
                    while(opc1!=5){
                        System.out.println("1. Ingresar deportista.");
                        System.out.println("2. Actualizar deportista.");
                        System.out.println("3. Eliminar deportista.");
                        System.out.println("4. Buscar deportista.");
                        System.out.println("5. Atras");
                        opc1 = teclado.nextInt();
                        switch (opc1){
                            case 1:
                                Ingresar();
                                break;
                            case 2:
                                Actualizar();
                                break;
                            case 3:
                                Eliminar();
                                break;
                            case 4:
                                Buscar();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("La opcion ingresada es incorrecta.");
                                break;
                        }
                    }
                    break;
                case 2:
                    int opc2=0;
                    while(opc2!=4){
                        System.out.println("1. Inscribir deportista.");
                        System.out.println("2. Eliminar deportista.");
                        System.out.println("3. Mostrar pruebas.");
                        System.out.println("4. Atras.");
                        opc2 = teclado.nextInt();
                        switch (opc2){
                            case 1:
                                Inscribir();
                                break;
                            case 2:
                                Eliminar_Prueba();
                                break;
                            case 3:
                                Mostrar_Pruebas();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("La opcion ingresada es incorrecta.");
                                break;
                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
    }
    public void Inscribir(){
        int i,Doc,validar=0,op=0;
        
        System.out.println("Ingrese el numero de identificacion del nadador a buscar: ");
        Doc = teclado.nextInt();
        if(cont!=0){
            for (i=0;i<cont;i++){
                if(Nadador[i].getDocumento() == Doc){
                    while(op!=5){
                        System.out.println("A cual prueba se va a inscribir:");
                        System.out.println("1. Libre");
                        System.out.println("2. Mariposa");
                        System.out.println("3. Pecho");
                        System.out.println("4. Espalda");
                        System.out.println("5. Atras");
                        op = teclado.nextInt();
                        switch(op){
                            case 1:
                                Nadador[i].setLibre(1);
                                break;
                            case 2:
                                Nadador[i].setMariposa(1);
                                break;
                            case 3:
                                Nadador[i].setPecho(1);
                                break;
                            case 4:
                                Nadador[i].setEspalda(1);
                                break;
                            default:
                                break;
                        }
                    }
                    validar=1;
                    break;
                }
            }
            if (validar==0){
                System.out.println("No existe en la base de datos.");
            }
        }else{
            System.out.println("No existe en la base de datos.");
        }
    }
    public void Eliminar_Prueba(){
         int i,Doc,validar=0,op;
        
        System.out.println("Ingrese el numero de identificacion del nadador a buscar: ");
        Doc = teclado.nextInt();
        if(cont!=0){
            for (i=0;i<cont;i++){
                if(Nadador[i].getDocumento() == Doc){
                    if(Nadador[i].getLibre()==1){
                        System.out.println("1. Libre ");
                    }
                    if(Nadador[i].getMariposa()==1){
                        System.out.println("2. Mariposa");
                    }
                    if(Nadador[i].getPecho()==1){
                        System.out.println("3. Pecho");
                    }
                    if(Nadador[i].getLibre()==1){
                        System.out.println("4. Espalda");
                    }
                    op = teclado.nextInt();
                    switch(op){
                        case 1:
                            Nadador[i].setLibre(0);
                            break;
                        case 2:
                            Nadador[i].setMariposa(0);
                            break;
                        case 3:
                            Nadador[i].setPecho(0);
                            break;
                        case 4:
                            Nadador[i].setEspalda(0);
                            break;
                        default:
                            break;
                    }
                    validar=1;
                    break;
                }
            }
            if (validar==0){
                System.out.println("No existe en la base de datos.");
            }
        }else{
            System.out.println("No existe en la base de datos.");
        }
    }
    public void Mostrar_Pruebas(){
        int i,op=0;
        while(op!=5){
            System.out.println("1. Libre");
            System.out.println("2. Mariposa");
            System.out.println("3. Pecho");
            System.out.println("4. Espalda");
            System.out.println("5. Atras");
            op=teclado.nextInt();
            switch(op){
                case 1:
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getLibre()==1 && Nadador[i].getCategoria()=='A'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getLibre()==1 && Nadador[i].getCategoria()=='B'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getLibre()==1 && Nadador[i].getCategoria()=='J'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getLibre()==1 && Nadador[i].getCategoria()=='S'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    break;
                case 2:
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getMariposa()==1 && Nadador[i].getCategoria()=='A'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getMariposa()==1 && Nadador[i].getCategoria()=='B'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getMariposa()==1 && Nadador[i].getCategoria()=='J'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getMariposa()==1 && Nadador[i].getCategoria()=='S'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    break;
                case 3:
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getPecho()==1 && Nadador[i].getCategoria()=='A'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getPecho()==1 && Nadador[i].getCategoria()=='B'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getPecho()==1 && Nadador[i].getCategoria()=='J'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getPecho()==1 && Nadador[i].getCategoria()=='S'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    break;
                case 4:
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getEspalda()==1 && Nadador[i].getCategoria()=='A'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getEspalda()==1 && Nadador[i].getCategoria()=='B'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getEspalda()==1 && Nadador[i].getCategoria()=='J'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    for(i=0;i<cont;i++){
                        if(Nadador[i].getEspalda()==1 && Nadador[i].getCategoria()=='S'){
                            System.out.println(Nadador[i].getNombre()+"   "+ Nadador[i].getCategoria());
                        }
                    }
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
    public void Ingresar(){
        
        Gestion N = new Gestion();
        
        teclado.nextLine();
        System.out.println("Nombre:");
        Nombre = teclado.nextLine();
        N.setNombre(Nombre);
        System.out.println("Documento: ");
        Documento = teclado.nextInt();
        N.setDocumento(Documento);
        teclado.nextLine();
        System.out.println("Sexo: ");
        Rama = teclado.nextLine();
        N.setRama(Rama);
        System.out.println("Año de nacimiento:");
        Fecha = teclado.nextInt();
        N.setFecha(Fecha);
        if (2005<Fecha && Fecha<2011){
            N.setCategoria('A');
        }else {
            if(Fecha>1999){
                N.setCategoria('B');
            }else{
                if(Fecha>1990){
                    N.setCategoria('J');
                }else{
                    N.setCategoria('S');
                }
            } 
        }
        
        Nadador[cont] = N;
        cont++;
    }
    public void Actualizar(){
        int Doc,op,validar=0,i;
        
        System.out.println("Ingrese el numero de identificacion del nadador a buscar: ");
        Doc = teclado.nextInt();
        if(cont!=0){
            for (i=0;i<cont;i++){
                if(Nadador[i].getDocumento() == Doc){
                    System.out.println("ACTUALIZAR");
                    System.out.println("1. Nombre");
                    System.out.println("2. Cedula");
                    System.out.println("3. Sexo");
                    System.out.println("4. Año de nacimiento");
                    System.out.println("5. Varios datos");
                    op=teclado.nextInt();
                    switch(op){
                        case 1:
                            teclado.nextLine();
                            System.out.println("Nombre:");
                            Nombre = teclado.nextLine();
                            Nadador[i].setNombre(Nombre);
                            break;
                        case 2:
                            System.out.println("Documento: ");
                            Documento = teclado.nextInt();
                            Nadador[i].setDocumento(Documento);
                            teclado.nextLine();
                            break;
                        case 3:
                            teclado.nextLine();
                            System.out.println("Sexo: ");
                            Rama = teclado.nextLine();
                            Nadador[i].setRama(Rama);
                            break;
                        case 4:
                            System.out.println("Año de nacimiento:");
                            Fecha = teclado.nextInt();
                            Nadador[i].setFecha(Fecha);
                            if (2005<Fecha && Fecha<2011){
                                Nadador[i].setCategoria('A');
                            }else {
                                if(Fecha>1999){
                                    Nadador[i].setCategoria('B');
                                }else{
                                    if(Fecha>1990){
                                        Nadador[i].setCategoria('J');
                                    }else{
                                        Nadador[i].setCategoria('S');
                                    }
                                } 
                            }
                            break;
                        default:
                            break;
                    }
                    validar=1;
                    break;
                }
            }
            if (validar==0){
                System.out.println("No existe en la base de datos.");
            }
        }else{
            System.out.println("No existe en la base de datos.");
        }
        
    }
    public void Eliminar(){
        
        int Doc,i,o;
        
        System.out.println("Ingrese el documento: ");
        Doc = teclado.nextInt();
        
        for(i=0;i<cont;i++){
            if(Nadador[i].getDocumento()==Doc){
                for (o=(i+1);o<=cont;o++){
                    Nadador[i]=Nadador[o];
                }
                cont--;
                break;
            }
        }
    }
    public void Buscar(){
        int i,Doc,validar=0;
        
        System.out.println("Ingrese el numero de identificacion del nadador a buscar: ");
        Doc = teclado.nextInt();
        if(cont!=0){
            for (i=0;i<cont;i++){
                if(Nadador[i].getDocumento() == Doc){
                    mostrar(Nadador[i]);
                    validar=1;
                    break;
                }
            }
            if (validar==0){
                System.out.println("No existe en la base de datos.");
            }
        }else{
            System.out.println("No existe en la base de datos.");
        }
    }
    public void mostrar(Gestion N){
        System.out.println("Nombre: "+N.getNombre());
        System.out.println("Documento: "+N.getDocumento());
        System.out.println("Sexo: "+N.getRama());
        System.out.println("Año de nacimiento: "+N.getFecha());
        System.out.println("Categoria: "+N.getCategoria());
        System.out.println("Pruebas:");
        if(N.getLibre()==1){
            System.out.println("Libre");
        }
        if(N.getMariposa()==1){
            System.out.println("Mariposa");
        }
        if(N.getPecho()==1){
            System.out.println("Pecho");
        }
        if(N.getEspalda()==1){
            System.out.println("Espalda");
        }
        if ((N.getLibre()==0)&&(N.getMariposa()==0)&&(N.getPecho()==0)&&(N.getEspalda()==0)){
            System.out.println("No pertenece a ninguna prueba");
        }
    }
    
    public static void main(String[] args) {
        Competencia Persona = new Competencia();
    }
    
}
