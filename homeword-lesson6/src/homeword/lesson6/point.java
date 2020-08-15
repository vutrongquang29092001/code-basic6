/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeword.lesson6;

/**
 *
 * @author vutro
 */
public class point {
    private float x ,y ,z ;

    public point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void infor(){
        System.out.println("tọa độ ("+this.x+","+this.y+","+this.z+")");
    } 
    
}
