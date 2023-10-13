package br.ufrn.imd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class Entity {
    Entity() {
    }
 
    public abstract String fileName();

    public abstract boolean validar();

    private boolean saveFile() {
        try {
            FileOutputStream fos = new FileOutputStream(new File(fileName()));
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this);
            
            oos.close();
            fos.close();

            return true;

        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
            return false;

        } catch (IOException e){
            System.out.println("Erro de IO!");
            return false;
            
        }
    }

    public boolean salvar() {
        return (validar()) ? saveFile() : false;
    }
}
