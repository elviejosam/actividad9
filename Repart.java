/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9;

/**
 *
 * @author Sam
 */
public class Repart {

    private int num;
    private String descrip;
    private int fecha;
    private int UPZ;
    private char confi;

    public Repart(int num, String descrip, int fecha,int UPZ, char confi) {
        this.num = num;
        this.descrip = descrip;
        this.fecha = fecha;
        this.UPZ = UPZ;
        this.confi = confi;
        
    }

    public int getUPZ() {
        return UPZ;
    }

    public void setUPZ(int UPZ) {
        this.UPZ = UPZ;
    }
    
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public char getConfi() {
        return confi;
    }

    public void setConfi(char confi) {
        this.confi = confi;
    }

    @Override
    public String toString() {
        return "Repart{" + "num=" + num + ", descrip=" + descrip + ", fecha=" + fecha + ", UPZ=" + UPZ + ", confi=" + confi + '}';
    }

}
