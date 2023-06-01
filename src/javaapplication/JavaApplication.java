/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication;

/**
 *
 * @author IT Supporter
 */
public class JavaApplication {

    public static void main(String[] args) {
        int n = 3; // số lượng đĩa
        char fromRod = 'A'; // cột ban đầu
        char toRod = 'C'; // cột đích
        char auxRod = 'B'; // cột trung gian
        
        solveTowerOfHanoi(n, fromRod, toRod, auxRod);
    }
    
    // Hàm giải quyết bài toán Tháp Hà Nội sử dụng đệ quy
    public static void solveTowerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) { // trường hợp cơ bản, khi chỉ có 1 đĩa
            System.out.println("Di chuyển đĩa 1 từ cột " + fromRod + " đến cột " + toRod);
            return;
        }
        
        solveTowerOfHanoi(n - 1, fromRod, auxRod, toRod); // di chuyển n-1 đĩa từ cột ban đầuđến cột trung gian, sử dụng cột đích làm cột trung gian
        System.out.println("Di chuyển đĩa " + n + " từ cột " + fromRod + " đến cột " + toRod);
        
        solveTowerOfHanoi(n - 1, auxRod, toRod, fromRod); // di chuyển n-1 đĩa từ cột trung gian đến cột đích, sử dụng cột ban đầu làm cột trung gian
    }
    
}