/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reallab07;

/**
 *
 * @author rodri
 */
public class Rectangle {
  
        int width;
        int height;
        
        public Rectangle(int width, int height){
    
        this.width = width;
        this.height = height;
        
    }
        
        public void draw(){
            for (int i = 0; i < height; i++){
            
                for (int j = 0; j < width; j++){
                    System.out.println("*");
                
                }
                System.out.print("");
            }
        
        
        }
        
        
        
        
    }
