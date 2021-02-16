import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Grille {

	int fcot;
	String name;
	boolean ia = true;
	
	boolean player = true;
	
	int[][] casebut = {{0, 0, 0, 0},{0, 100, 200, 300},{0, 400, 500, 600},{0, 700, 800, 900}};
	
	public void notClick() {
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= 3; j++) {
				if(casebut[i][j] != 1 && casebut[i][j] != 2) {
					casebut[i][j] = 0;
				}
			}
		}
	}
	
	boolean[][] notfill = {{true,true,true,true},{true,false, false, false},{true,false, false, false},{true,false, false, false}};
	boolean equal = true;
	
	public void allfill() {
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= 3; j++) {
				if(casebut[i][j] == 1 || casebut[i][j] == 2 || casebut[i][j] == 0) {
					notfill[i][j] = true;
				}
			}
		}
	}
	
	public void testWin(JFrame frame, JPanel blueWin, JPanel redWin, JPanel equality, JButton case1, JButton case2, JButton case3, JButton case4, JButton case5, JButton case6, JButton case7, JButton case8, JButton case9, JPanel pannel) {
		allfill();
		
		if(casebut[1][1] == casebut[1][2] && casebut[1][1] == casebut[1][3]) {
			
			notClick();
			allfill();
			equal = false;
			
			if(casebut[1][1] == 1){
				frame.add(blueWin);
			}
			else if(casebut[1][1] == 2){
				frame.add(redWin);
			}
		}
		else if(casebut[2][1] == casebut[2][2] && casebut[2][1] == casebut[2][3]) {
			
			notClick();
			allfill();
			equal = false;
			
			if(casebut[2][1] == 1){
				frame.add(blueWin);
			}
			else if(casebut[2][1] == 2){
				frame.add(redWin);
			}
		}
		else if(casebut[3][1] == casebut[3][2] && casebut[3][1] == casebut[3][3]) {
			
			notClick();
			allfill();
			equal = false;
			
			if(casebut[3][1] == 1){
				frame.add(blueWin);
			}
			else if(casebut[3][1] == 2){
				frame.add(redWin);
			}
		}
		else if(casebut[1][1] == casebut[2][1] && casebut[1][1] == casebut[3][1]) {
			
			notClick();
			allfill();
			equal = false;
			
			if(casebut[1][1] == 1){
				frame.add(blueWin);
			}
			else if(casebut[1][1] == 2){
				frame.add(redWin);
			}
		}
		else if(casebut[1][2] == casebut[2][2] && casebut[1][2] == casebut[3][2]) {
			
			notClick();
			allfill();
			equal = false;
			
			if(casebut[1][2] == 1){
				frame.add(blueWin);
			}
			else if(casebut[1][2] == 2){
				frame.add(redWin);
			}
		}
		else if(casebut[1][3] == casebut[2][3] && casebut[1][3] == casebut[3][3]) {
			
			notClick();
			allfill();
			equal = false;
			
			if(casebut[1][3] == 1){
				frame.add(blueWin);
			}
			else if(casebut[1][3] == 2){
				frame.add(redWin);
			}
		}
		else if(casebut[1][1] == casebut[2][2] && casebut[1][1] == casebut[3][3]) {
			
			notClick();
			allfill();
			equal = false;
			
			if(casebut[1][1] == 1){
				frame.add(blueWin);
			}
			else if(casebut[1][1] == 2){
				frame.add(redWin);
			}
		}
		else if(casebut[3][1] == casebut[2][2] && casebut[3][1] == casebut[1][3]) {
			
			notClick();
			allfill();
			equal = false;
			
			if(casebut[3][1] == 1){
				frame.add(blueWin);
			}
			else if(casebut[3][1] == 2){
				frame.add(redWin);
			}
		}
		else if(notfill[1][1] == true && notfill[2][1] == true && notfill[3][1] == true && notfill[1][2] == true && notfill[2][2] == true && notfill[3][2] == true && notfill[1][3] == true && notfill[2][3] == true && notfill[3][3] == true && equal == true){
			
			frame.add(equality);
			
		}
		
		if(notfill[1][1] == true && notfill[2][1] == true && notfill[3][1] == true && notfill[1][2] == true && notfill[2][2] == true && notfill[3][2] == true && notfill[1][3] == true && notfill[2][3] == true && notfill[3][3] == true) {
			frame.remove(case1);
			frame.remove(case2);
			frame.remove(case3);
			frame.remove(case4);
			frame.remove(case5);
			frame.remove(case6);
			frame.remove(case7);
			frame.remove(case8);
			frame.remove(case9);
			frame.remove(pannel);
			
			frame.repaint();
			frame.invalidate();
			frame.validate();
		}
		
	};
	
	int x;
	int y;
	int turnIA = 1;
	
	boolean[] easy = {false, false, false, false, false, false, false, false, false, false, false, false, false, false};
	
	public void colorCase(JButton case1, JButton case2, JButton case3, JButton case4, JButton case5, JButton case6, JButton case7, JButton case8, JButton case9) {
		if(x == 1 && y == 1) {
			case1.setBackground(Color.RED);
		}
		else if(x == 1 && y == 2) {
			case2.setBackground(Color.RED);
		}
		else if(x == 1 && y == 3) {
			case3.setBackground(Color.RED);
		}
		else if(x == 2 && y == 1) {
			case4.setBackground(Color.RED);
		}
		else if(x == 2 && y == 2) {
			case5.setBackground(Color.RED);
		}
		else if(x == 2 && y == 3) {
			case6.setBackground(Color.RED);
		}
		else if(x == 3 && y == 1) {
			case7.setBackground(Color.RED);
		}
		else if(x == 3 && y == 2) {
			case8.setBackground(Color.RED);
		}
		else if(x == 3 && y == 3) {
			case9.setBackground(Color.RED);
		}
	}
	
	public void intel(JButton case1, JButton case2, JButton case3, JButton case4, JButton case5, JButton case6, JButton case7, JButton case8, JButton case9) {
		
		if(turnIA == 1) {
			if(casebut[2][2] != 1) {
				x = 2;
				y = 2;
				
				easy[2] = true;
			}
			else {
				x = 1;
				y = 1;
				
				easy[1] = true;
			}
			
			turnIA = turnIA + 1;
		}
		else if(turnIA == 2) {
			if(easy[1] == true) {
				if(casebut[3][3] == 1) {
					x = 1;
					y = 3;
					
					easy[0] = true;
				}
				else {
					for(int i = 0; i <= 3; i++) {
						for(int j = 0; j <= 3; j++) {
							if(casebut[i][j] == 1 && i*j != 4) {
								if(i == 2) {
									x = 2;
								}
								else if(i == 1) {
									x = 3;
								}
								else if(i == 3) {
									x = 1;
								}
								
								if(j == 2) {
									y = 2;
								}
								else if(j == 1) {
									y = 3;
								}
								else if(j == 3) {
									y = 1;
								}
							}
						}
					}
				}
			}
			else if(easy[2] == true) {
				if((casebut[1][1] == 1 && casebut[3][3] == 1) || (casebut[1][3] == 1 && casebut[3][1] == 1)) {
					x = 1;
					y = 2;
					
					easy[3] = true;
				}
				else if(casebut[1][1] == casebut[1][3] || casebut[1][1] == casebut[3][1] || casebut[1][3] == casebut[3][3] || casebut[3][1] == casebut[3][3]) {
					if(casebut[1][1] == casebut[1][3]) {
						x = 1;
						y = 2;
					}
					else if(casebut[1][1] == casebut[3][1]) {
						x = 2;
						y = 1;
					}
					else if(casebut[1][3] == casebut[3][3]) {
						x = 2;
						y = 3;
					}
					else {
						x = 3;
						y = 2;
					}
					
					easy[4] = true;
				}
				else if(casebut[2][1] == casebut[1][2] || casebut[1][2] == casebut[2][3] || casebut[2][3] == casebut[3][2] || casebut[3][2] == casebut[2][1]) {
					if(casebut[2][1] == casebut[1][2]) {
						x = 1;
						y = 3;
						
						easy[9] = true;
					}
					else if(casebut[1][2] == casebut[2][3]) {
						x = 1;
						y = 1;
						
						easy[10] = true;
					}
					else if(casebut[2][3] == casebut[3][2]) {
						x = 1;
						y = 3;
						
						easy[11] = true;
					}
					else if(casebut[3][2] == casebut[2][1]) {
						x = 1; 
						y = 1;
						
						easy[12] = true;
					}
				}
				else if(casebut[2][1] == casebut[2][3] || casebut[1][2] == casebut[3][2]) {
					if(casebut[2][1] == casebut[2][3]) {
						x = 1;
						y = 2;
						
						easy[7] = true;
					}
					else {
						x = 2;
						y = 1;
						
						easy[8] = true;
					}
				}
				else {
					if(casebut[1][1] == casebut[1][2]) {
						x = 1;
						y = 3;
					}
					else if(casebut[1][3] == casebut[1][2]) {
						x = 1;
						y = 1;
					}
					else if(casebut[3][1] == casebut[3][2]) {
						x = 3;
						y = 3;
					}
					else if(casebut[3][3] == casebut[3][2]) {
						x = 3;
						y = 1;
					}
					else if(casebut[1][1] == casebut[2][1]) {
						x = 3;
						y = 1;
					}
					else if(casebut[3][1] == casebut[2][1]) {
						x = 1;
						y = 1;
					}
					else if(casebut[1][3] == casebut[2][3]) {
						x = 3;
						y = 3;
					}
					else if(casebut[3][3] == casebut[2][3]) {
						x = 1;
						y = 3;
					}
					
					easy[5] = true;
				}
			}
			
			turnIA = turnIA + 1;
		}
		else if(turnIA == 3) {
			if(easy[1] == true) {
			if(casebut[1][3] == 2) {
				if(casebut[1][2] == 200) {
					x = 1;
					y = 2;
				}
				else {
					x = 3;
					y = 2;
				}
			}
			else if(casebut[1][2] == 1 || casebut[2][1] == 1 || casebut[2][3] == 1 || casebut[3][2] == 1 || casebut[1][3] == 1) {
				if(x == 1) {
					if(y == 2) {
						if(casebut[1][3] != 1) {
							x = 1;
							y = 3;
						}
						else {
							x = 3;
							y = 1;
						}
					}
					else if(y == 3) {
						if(casebut[1][2] != 1) {
							x = 1;
							y = 2;
						}
						else {
							x = 3;
							y = 2;
						}
					}
				}
				else if(x == 2) {
					if(y == 1) {
						if(casebut[3][1] != 1) {
							x = 3;
							y = 1;
						}
						else {
							x = 1;
							y = 3;
						}
					}
					else if(y == 3) {
						if(casebut[3][3] == 1) {
							x = 1;
							y = 3;
						}
						else {
							if(casebut[1][2] == 1) {
								x = 3;
								y = 2;
							}
							else if(casebut[3][2] == 1) {
								x = 1;
								y = 2;
							}
							else if(casebut[1][3] == 1) {
								x = 3;
								y = 1;
							}
							else if(casebut[3][1] == 1) {
								x = 1;
								y = 3;
							}
							else if(casebut[2][1] == 1) {
								x = 2;
								y = 3;
							}
						}
					}
				}
				else if(x == 3) {
					if(y == 1) {
						if(casebut[2][1] != 1) {
							x = 2;
							y = 1;
						}
						else {
							x = 2;
							y = 3;
						}
					}
					else if(y == 2) {
						if(casebut[3][3] == 1) {
							x = 3;
							y = 1;
						}
						else if(casebut[2][1] == 1) {
							x = 2;
							y = 3;
						}
						else if(casebut[3][1] == 1) {
							x = 1;
							y = 3;
						}
						else if(casebut[2][3] == 1) {
							x = 2;
							y = 1;
						}
						else if(casebut[1][2] == 1) {
							x = 3;
							y = 2;
						}
						else if(casebut[1][3] == 1) {
							x = 3;
							y = 1;
						}
					}
				}
			}
			}
			else if(easy[2] == true) {
				if(easy[3] == true) {
					if(casebut[3][2] == 800) {
						x = 3;
						y = 2;
					}
					else if(casebut[3][1] == 1) {
						x = 3;
						y = 3;
					}
					else {
						x = 3;
						y = 1;
					}
				}
				else if (easy[4] == true) {
					if(casebut[1][2] == 2) {
						if(casebut[3][2] == 800) {
							x = 3;
							y = 2;
						}
						else {
							x = 2;
							y = 1;
						}
					}
					else if(casebut[2][1] == 2) {
						if(casebut[2][3] == 600) {
							x = 2;
							y = 3;
						}
						else {
							x = 1;
							y = 2;
						}
					}
					else if(casebut[2][3] == 2) {
						if(casebut[2][1] == 400) {
							x = 2;
							y = 1;
						}
						else {
							x = 1;
							y = 2;
						}
					}
					else {
						if(casebut[1][2] == 200) {
							x = 1;
							y = 2;
						}
						else {
							x = 2;
							y = 1;
						}
					}
				}
				else if(easy[5] == true) {
					if(casebut[1][1] == 2) {
						if(casebut[3][3] == 900) {
							x = 3;
							y = 3;
						}
						else {
							x = 2;
							y = 3;
						}
					}
					else if(casebut[1][3] == 2) {
						if(casebut[3][1] == 700) {
							x = 3;
							y = 1;
						}
						else {
							x = 2;
							y = 1;
						}
					}
					else if(casebut[3][1] == 2) {
						if(casebut[1][3] == 300) {
							x = 1;
							y = 3;
						}
						else {
							x = 2;
							y = 3;
						}
					}
					else if(casebut[3][3] == 2) {
						if(casebut[1][1] == 100) {
							x = 1;
							y = 1;
						}
						else {
							x = 2;
							y = 1;
						}
					}
					else if(casebut[1][1] == 1) {
						if(casebut[3][1] == 1) {
							x = 2;
							y = 1;
						}
						else {
							x = 1;
							y = 2;
						}
					}
					else if(casebut[1][3] == 1) {
						if(casebut[1][1] == 1) {
							x = 1;
							y = 2;
						}
						else {
							x = 2;
							y = 3;
						}
					}
					else if(casebut[3][1] == 1) {
						if(casebut[1][1] == 1) {
							x = 2;
							y = 1;
						}
						else {
							x = 3;
							y = 2;
						}
					}
					else if(casebut[3][3] == 1) {
						if(casebut[3][1] == 1) {
							x = 3;
							y = 2;
						}
						else {
							x = 2;
							y = 3;
						}
					}
				}
				else if(easy[7] == true) {
					if(casebut[3][2] != 1) {
						x = 3;
						y = 2;
					}
					else {
						x = 1;
						y = 1;
					}
				}
				else if(easy[8] == true) {
					if(casebut[2][3] != 1) {
						x = 2;
						y = 3;
					}
					else {
						x = 1;
						y = 1;
					}
				}
				else if(easy[9] == true) {
					if(casebut[3][1] != 1) {
						x = 3;
						y = 1;
					}
					else {
						x = 1;
						y = 1;
					}
				}
				else if(easy[10] == true) {
					if(casebut[3][3] != 1) {
						x = 3;
						y = 3;
					}
					else {
						x = 1;
						y = 3;
					}
				}
				else if(easy[11] == true) {
					if(casebut[3][1] != 1) {
						x = 3;
						y = 1;
					}
					else {
						x = 3;
						y = 3;
					}
				}
				else if(easy[12] == true) {
					if(casebut[3][3] != 1) {
						x = 3;
						y = 3;
					}
					else {
						x = 3;
						y = 1;
					}
				}
			}
			
			turnIA = turnIA + 1;
		}
		else if(turnIA == 4){
			if(easy[1] == true) {
			if(easy[0] == true) {
			if(casebut[3][2] == 2) {
				if(casebut[2][1] == 1) {
					x = 2;
					y = 3;
				}
				else if(casebut[2][3] == 1) {
					x = 2;
					y = 1;
				}
				else if(casebut[3][1] == 1){
					x = 2;
					y = 3;
				}
			}
			}
			else if(casebut[2][1] == 2 && casebut[3][1] == 700) {
				x = 3;
				y = 1;
			}
			else if(casebut[1][2] == 2 && casebut[1][3] == 300) {
				x = 1;
				y = 3;
			}
			else {
				for(int i = 0; i <= 3; i++) {
					for(int j = 0; j <= 3; j++) {
						if(casebut[i][j] != 0 && casebut[i][j] != 1 && casebut[i][j] != 2) {
							if(i == 1) {
								if(j == 2) {
									if(casebut[2][2] == casebut[3][2] || casebut[1][1]== casebut[1][3]) {
										x = 1;
										y = 2;
										
										easy[6] = true;
										easy[13] = true;
									}
									else if(easy[13] == false){
										easy[6] = false;
									}
								}
								if(j == 3) {
									if(casebut[2][3] == casebut[3][3] || casebut[2][2] == casebut[3][1] || casebut[1][2] == casebut[1][1]) {
										x = 1;
										y = 3;
										
										easy[6] = true;
										easy[13] = true;
									}
									else if(easy[13] == false){
										easy[6] = false;
									}
								}
							}
							if(i == 2) {
								if(j == 1) {
									if(casebut[1][1] == casebut[1][3] || casebut[2][2]== casebut[2][3]) {
										x = 2;
										y = 1;
										
										easy[6] = true;
										easy[13] = true;
									}
									else if(easy[13] == false){
										easy[6] = false;
									}
								}
								if(j == 3) {
									if(casebut[1][3] == casebut[3][3] || casebut[2][2] == casebut[2][1]) {
										x = 2;
										y = 3;
										
										easy[6] = true;
										easy[13] = true;
									}
									else if(easy[13] == false){
										easy[6] = false;
									}
								}
							}
							if(i == 3) {
								if(j == 1) {
									if(casebut[2][2] == casebut[1][3] || casebut[3][2]== casebut[3][3] || casebut[1][1] == casebut[2][1]) {
										x = 3;
										y = 1;
										
										easy[6] = true;
										easy[13] = true;
									}
									else if(easy[13] == false){
										easy[6] = false;
									}
								}
								if(j == 2) {
									if(casebut[2][2] == casebut[1][2] || casebut[1][3]== casebut[3][3]) {
										x = 3;
										y = 2;
										
										easy[6] = true;
										easy[13] = true;
									}
									else if(easy[13] == false){
										easy[6] = false;
									}
								}
								if(j == 3) {
									if(casebut[2][2] == casebut[1][1] || casebut[3][1] == casebut[3][2] || casebut[1][3] == casebut[2][3]) {
										x = 3;
										y = 3;
										
										easy[6] = true;
										easy[13] = true;
									}
									else if(easy[13] == false){
										easy[6] = false;
									}
								}
							}
						}
					}
				}
				
				if(easy[6] == false) {
					for(int i = 0; i <= 3; i ++) {
						for(int j = 0; j <= 3; j++) {
							if(casebut[i][j] != 0 && casebut[i][j] != 1 && casebut[i][j] != 2) {
								if(i == 1) {
									if(j == 2) {
										x = 1;
										y = 2;
									}
									if(j == 3) {
										x = 1;
										y = 3;
									}
								}
								if(i == 2) {
									if(j == 1) {
										x = 2;
										y = 1;
									}
									if(j == 3) {
										x = 2;
										y = 3;
									}
								}
								if(i == 3) {
									if(j == 1) {
										x = 3;
										y = 1;
									}
									if(j == 2) {
										x = 3;
										y = 2;
									}
									if(j == 3) {
										x = 3;
										y = 3;
									}
								}
							}
						}
					}
				}
			}
			}
			else if(easy[2] == true) {
				if(easy[3] == true) {
					if(casebut[3][1] == 2) {
						if(casebut[1][3] == 300) {
							x = 1;
							y = 3;
						}
						else {
							x = 2;
							y = 3;
						}
					}
					else {
						if(casebut[1][1] == 100) {
							x = 1;
							y = 1;
						}
						else {
							x = 2;
							y = 1;
						}
					}
				}
				else if(easy[4] == true) {
					if(casebut[1][2] == 200 || casebut[2][1] == 400 || casebut[2][3] == 600 || casebut[3][2] == 800) {
						if(casebut[1][2] == 200) {
							x = 1;
							y = 2;
						}
						else if(casebut[2][1] == 400) {
							x = 2;
							y = 1;
						}
						else if(casebut[2][3] == 600) {
							x = 2;
							y = 3;
						}
						else {
							x = 3;
							y = 2;
						}
					}
					else {
						for(int i = 0; i <= 3; i++) {
							for(int j = 0; j <= 3; j++) {
								if(casebut[i][j] != 0 && casebut[i][j] != 1 && casebut[i][j] != 2) {
									x = i;
									y = j;
								}
							}
						}
					}
				}
				else if(easy[5] == true) {
					if(casebut[1][1] == 100) {
						x = 1;
						y = 1;
					}
					else if(casebut[1][3] == 300) {
						x = 1;
						y = 3;
					}
					else if(casebut[3][1] == 700) {
						x = 3;
						y = 1;
					}
					else if(casebut[3][3] == 900) {
						x = 3;
						y = 3;
					}
				}
				else if(easy[7] == true) {
					if(casebut[3][3] != 1) {
						x = 3;
						y = 3;
					}
					else {
						x = 1;
						y = 3;
					}
				}
				else if(easy[8] == true) {
					if(casebut[3][3] != 1) {
						x = 3;
						y = 3;
					}
					else {
						x = 3;
						y = 1;
					}
				}
				else if(easy[9] == true) {
					if(casebut[3][3] != 1) {
						x = 3;
						y = 3;
					}
					else {
						x = 3;
						y = 2;
					}
				}
				else if(easy[10] == true) {
					if(casebut[3][1] != 1) {
						x = 3;
						y = 1;
					}
					else {
						x = 3;
						y = 2;
					}
				}
				else if(easy[11] == true) {
					if(casebut[1][1] != 1) {
						x = 1;
						y = 1;
					}
					else {
						x = 2;
						y = 1;
					}
				}
				else if(easy[12] == true) {
					if(casebut[1][3] != 1) {
						x = 1;
						y = 3;
					}
					else {
						x = 2;
						y = 3;
					}
				}
			}
			
		}
		
		colorCase(case1, case2, case3, case4, case5, case6, case7, case8, case9);
		casebut[x][y] = 2;
		player = true;
		
	}
		
	public Grille(String name, int fcot) {
		
		this.name = name;
		this.fcot = fcot;
		
		JFrame frame = new JFrame(name);
		
		JPanel pannel = new JPanel();
		
		pannel.setBounds(fcot/5, fcot/5, fcot-(fcot/10), fcot-(fcot/10));
		pannel.setBackground(Color.BLACK);
		
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Nombre de joueurs");
		JMenuItem j1 = new JMenuItem("1 joueur");
		JMenuItem j2 = new JMenuItem("2 joueurs");
		menu.add(j1);
		menu.add(j2);
		menubar.add(menu);
		
		JPanel blueWin = new JPanel();
		blueWin.setBackground(Color.BLUE);
		blueWin.setBounds(fcot/5, fcot/5, fcot-(fcot/10), fcot-(fcot/10));
		JButton winBlue = new JButton("Blue Win !");
		winBlue.setBackground(Color.WHITE);
		blueWin.add(winBlue);
		
		JPanel redWin = new JPanel();
		redWin.setBackground(Color.RED);
		redWin.setBounds(fcot/5, fcot/5, fcot-(fcot/10), fcot-(fcot/10));
		JButton winRed = new JButton("Red Win !");
		winRed.setBackground(Color.WHITE);
		redWin.add(winRed);
		
		JPanel equality = new JPanel();
		equality.setBackground(Color.WHITE);
		equality.setBounds(fcot/5, fcot/5, fcot-(fcot/10), fcot-(fcot/10));
		JButton winNobody = new JButton("Null...");
		winNobody.setBackground(Color.BLACK);
		equality.add(winNobody);
		
		JButton case1 = new JButton();
		case1.setBounds(0, 0, fcot/3, fcot/3);
		case1.setBackground(Color.WHITE);
		frame.add(case1);
		
		JButton case2 = new JButton();
		case2.setBounds(fcot/3, 0, fcot/3, fcot/3);
		case2.setBackground(Color.WHITE);
		frame.add(case2);
		
		JButton case3 = new JButton();
		case3.setBounds(2*(fcot/3), 0, fcot/3, fcot/3);
		case3.setBackground(Color.WHITE);
		frame.add(case3);
		
		JButton case4 = new JButton();
		case4.setBounds(0, fcot/3, fcot/3, fcot/3);
		case4.setBackground(Color.WHITE);
		frame.add(case4);
		
		JButton case5 = new JButton();
		case5.setBounds(fcot/3, fcot/3, fcot/3, fcot/3);
		case5.setBackground(Color.WHITE);
		frame.add(case5);
		
		JButton case6 = new JButton();
		case6.setBounds(2*(fcot/3), fcot/3, fcot/3, fcot/3);
		case6.setBackground(Color.WHITE);
		frame.add(case6);
		
		JButton case7 = new JButton();
		case7.setBounds(0, 2*(fcot/3), fcot/3, fcot/3);
		case7.setBackground(Color.WHITE);
		frame.add(case7);
		
		JButton case8 = new JButton();
		case8.setBounds(fcot/3, 2*(fcot/3), fcot/3, fcot/3);
		case8.setBackground(Color.WHITE);
		frame.add(case8);
		
		JButton case9 = new JButton();
		case9.setBounds(2*(fcot/3), 2*(fcot/3), fcot/3, fcot/3);
		case9.setBackground(Color.WHITE);
		frame.add(case9);
		
		case1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(casebut[1][1] != 0 && casebut[1][1] != 1 && casebut[1][1] != 2) {
					if(player == true) {
						case1.setBackground(Color.BLUE);
						
						player = false;
						casebut[1][1] = 1;
						
						if(ia == true) {
							intel(case1, case2, case3, case4, case5, case6, case7, case8, case9);
						}
					}
					else if(ia == false){
						case1.setBackground(Color.RED);
						
						player = true;
						casebut[1][1] = 2;
					}
				}
				
				testWin(frame, blueWin, redWin, equality, case1, case2, case3, case4, case5, case6, case7, case8, case9, pannel);
			}
		});
		case2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(casebut[1][2] != 0 && casebut[1][2] != 1 && casebut[1][2] != 2) {
					if(player == true) {
						case2.setBackground(Color.BLUE);
						
						player = false;
						casebut[1][2] = 1;
						
						if(ia == true) {
							intel(case1, case2, case3, case4, case5, case6, case7, case8, case9);
						}
					}
					else if(ia == false){
						case2.setBackground(Color.RED);
						
						player = true;
						casebut[1][2] = 2;
					}
				}
				
				testWin(frame, blueWin, redWin, equality, case1, case2, case3, case4, case5, case6, case7, case8, case9, pannel);
			}
		});
		case3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(casebut[1][3] != 0 && casebut[1][3] != 1 && casebut[1][3] != 2) {
					if(player == true) {
						case3.setBackground(Color.BLUE);
						
						player = false;
						casebut[1][3] = 1;
						
						if(ia == true) {
							intel(case1, case2, case3, case4, case5, case6, case7, case8, case9);
						}
					}
					else if(ia == false){
						case3.setBackground(Color.RED);
						
						player = true;
						casebut[1][3] = 2;
					}
				}
				
				testWin(frame, blueWin, redWin, equality, case1, case2, case3, case4, case5, case6, case7, case8, case9, pannel);
			}
		});
		case4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(casebut[2][1] != 0 && casebut[2][1] != 1 && casebut[2][1] != 2) {
					if(player == true) {
						case4.setBackground(Color.BLUE);
						
						player = false;
						casebut[2][1] = 1;
						
						if(ia == true) {
							intel(case1, case2, case3, case4, case5, case6, case7, case8, case9);
						}
					}
					else if(ia == false){
						case4.setBackground(Color.RED);
						
						player = true;
						casebut[2][1] = 2;
					}
				}
				
				testWin(frame, blueWin, redWin, equality, case1, case2, case3, case4, case5, case6, case7, case8, case9, pannel);
			}
		});
		case5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(casebut[2][2] != 0 && casebut[2][2] != 1 && casebut[2][2] != 2) {
					if(player == true) {
						case5.setBackground(Color.BLUE);
						
						player = false;
						casebut[2][2] = 1;
						
						if(ia == true) {
							intel(case1, case2, case3, case4, case5, case6, case7, case8, case9);
						}
					}
					else if(ia == false){
						case5.setBackground(Color.RED);
						
						player = true;
						casebut[2][2] = 2;
					}
				}
				
				testWin(frame, blueWin, redWin, equality, case1, case2, case3, case4, case5, case6, case7, case8, case9, pannel);
			}
		});
		case6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(casebut[2][3] != 0 && casebut[2][3] != 1 && casebut[2][3] != 2) {
					if(player == true) {
						case6.setBackground(Color.BLUE);
						
						player = false;
						casebut[2][3] = 1;
						
						if(ia == true) {
							intel(case1, case2, case3, case4, case5, case6, case7, case8, case9);
						}
					}
					else if(ia == false){
						case6.setBackground(Color.RED);
						
						player = true;
						casebut[2][3] = 2;
					}
				}
				
				testWin(frame, blueWin, redWin, equality, case1, case2, case3, case4, case5, case6, case7, case8, case9, pannel);
			}
		});
		case7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(casebut[3][1] != 0 && casebut[3][1] != 1 && casebut[3][1] != 2) {
					if(player == true) {
						case7.setBackground(Color.BLUE);
						
						player = false;
						casebut[3][1] = 1;
						
						if(ia == true) {
							intel(case1, case2, case3, case4, case5, case6, case7, case8, case9);
						}
					}
					else if(ia == false){
						case7.setBackground(Color.RED);
						
						player = true;
						casebut[3][1] = 2;
					}
				}
				
				testWin(frame, blueWin, redWin, equality, case1, case2, case3, case4, case5, case6, case7, case8, case9, pannel);
			}
		});
		case8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(casebut[3][2] != 0 && casebut[3][2] != 1 && casebut[3][2] != 2) {
					if(player == true) {
						case8.setBackground(Color.BLUE);
						
						player = false;
						casebut[3][2] = 1;
						
						if(ia == true) {
							intel(case1, case2, case3, case4, case5, case6, case7, case8, case9);
						}
					}
					else if(ia == false){
						case8.setBackground(Color.RED);
						
						player = true;
						casebut[3][2] = 2;
					}
				}
				
				testWin(frame, blueWin, redWin, equality, case1, case2, case3, case4, case5, case6, case7, case8, case9, pannel);
			}
		});
		case9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(casebut[3][3] != 0 && casebut[3][3] != 1 && casebut[3][3] != 2) {
					if(player == true) {
						case9.setBackground(Color.BLUE);
						
						player = false;
						casebut[3][3] = 1;
						
						if(ia == true) {
							intel(case1, case2, case3, case4, case5, case6, case7, case8, case9);
						}
					}
					else if(ia == false){
						case9.setBackground(Color.RED);
						
						player = true;
						casebut[3][3] = 2;
					}
				}
				
				testWin(frame, blueWin, redWin, equality, case1, case2, case3, case4, case5, case6, case7, case8, case9, pannel);
			}
		});
		
		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ia = true;
			}
		});
		j2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ia = false;
			}
		});
		
		winBlue.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player = true;
				casebut[1][1] = 100;
				casebut[1][2] = 200;
				casebut[1][3] = 300;
				casebut[2][1] = 400;
				casebut[2][2] = 500;
				casebut[2][3] = 600;
				casebut[3][1] = 700;
				casebut[3][2] = 800;
				casebut[3][3] = 900;
				equal = true;
				notfill[1][1] = false;
				notfill[1][2] = false;
				notfill[1][3] = false;
				notfill[2][1] = false;
				notfill[2][2] = false;
				notfill[2][3] = false;
				notfill[3][1] = false;
				notfill[3][2] = false;
				notfill[3][3] = false;
				turnIA = 1;
				easy[0] = false;
				easy[1] = false;
				easy[2] = false;
				easy[3] = false;
				easy[4] = false;
				easy[5] = false;
				easy[6] = false;
				easy[7] = false;
				easy[8] = false;
				easy[9] = false;
				easy[10] = false;
				easy[11] = false;
				easy[12] = false;
				easy[13] = false;
			
				frame.remove(blueWin);
				
				frame.repaint();
				frame.invalidate();
				frame.validate();
				
				case1.setBackground(Color.WHITE);
				case2.setBackground(Color.WHITE);
				case3.setBackground(Color.WHITE);
				case4.setBackground(Color.WHITE);
				case5.setBackground(Color.WHITE);
				case6.setBackground(Color.WHITE);
				case7.setBackground(Color.WHITE);
				case8.setBackground(Color.WHITE);
				case9.setBackground(Color.WHITE);
				
				frame.add(case1);
				frame.add(case2);
				frame.add(case3);
				frame.add(case4);
				frame.add(case5);
				frame.add(case6);
				frame.add(case7);
				frame.add(case8);
				frame.add(case9);
				
				frame.add(pannel);
		}});
		winRed.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player = true;
				casebut[1][1] = 100;
				casebut[1][2] = 200;
				casebut[1][3] = 300;
				casebut[2][1] = 400;
				casebut[2][2] = 500;
				casebut[2][3] = 600;
				casebut[3][1] = 700;
				casebut[3][2] = 800;
				casebut[3][3] = 900;
				equal = true;
				notfill[1][1] = false;
				notfill[1][2] = false;
				notfill[1][3] = false;
				notfill[2][1] = false;
				notfill[2][2] = false;
				notfill[2][3] = false;
				notfill[3][1] = false;
				notfill[3][2] = false;
				notfill[3][3] = false;
				turnIA = 1;
				easy[0] = false;
				easy[1] = false;
				easy[2] = false;
				easy[3] = false;
				easy[4] = false;
				easy[5] = false;
				easy[6] = false;
				easy[7] = false;
				easy[8] = false;
				easy[9] = false;
				easy[10] = false;
				easy[11] = false;
				easy[12] = false;
				easy[13] = false;
				
				frame.remove(redWin);
				
				frame.repaint();
				frame.invalidate();
				frame.validate();
				
				case1.setBackground(Color.WHITE);
				case2.setBackground(Color.WHITE);
				case3.setBackground(Color.WHITE);
				case4.setBackground(Color.WHITE);
				case5.setBackground(Color.WHITE);
				case6.setBackground(Color.WHITE);
				case7.setBackground(Color.WHITE);
				case8.setBackground(Color.WHITE);
				case9.setBackground(Color.WHITE);
				
				frame.add(case1);
				frame.add(case2);
				frame.add(case3);
				frame.add(case4);
				frame.add(case5);
				frame.add(case6);
				frame.add(case7);
				frame.add(case8);
				frame.add(case9);
				
				frame.add(pannel);
							
		}});
		winNobody.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player = true;
				casebut[1][1] = 100;
				casebut[1][2] = 200;
				casebut[1][3] = 300;
				casebut[2][1] = 400;
				casebut[2][2] = 500;
				casebut[2][3] = 600;
				casebut[3][1] = 700;
				casebut[3][2] = 800;
				casebut[3][3] = 900;
				equal = true;
				notfill[1][1] = false;
				notfill[1][2] = false;
				notfill[1][3] = false;
				notfill[2][1] = false;
				notfill[2][2] = false;
				notfill[2][3] = false;
				notfill[3][1] = false;
				notfill[3][2] = false;
				notfill[3][3] = false;
				turnIA = 1;
				easy[0] = false;
				easy[1] = false;
				easy[2] = false;
				easy[3] = false;
				easy[4] = false;
				easy[5] = false;
				easy[6] = false;
				easy[7] = false;
				easy[8] = false;
				easy[9] = false;
				easy[10] = false;
				easy[11] = false;
				easy[12] = false;
				easy[13] = false;
				
				frame.remove(equality);
				
				frame.repaint();
				frame.invalidate();
				frame.validate();
				
				case1.setBackground(Color.WHITE);
				case2.setBackground(Color.WHITE);
				case3.setBackground(Color.WHITE);
				case4.setBackground(Color.WHITE);
				case5.setBackground(Color.WHITE);
				case6.setBackground(Color.WHITE);
				case7.setBackground(Color.WHITE);
				case8.setBackground(Color.WHITE);
				case9.setBackground(Color.WHITE);
				
				frame.add(case1);
				frame.add(case2);
				frame.add(case3);
				frame.add(case4);
				frame.add(case5);
				frame.add(case6);
				frame.add(case7);
				frame.add(case8);
				frame.add(case9);
				
				frame.add(pannel);
							
		}});
		
		frame.add(pannel);
		frame.setJMenuBar(menubar);
		frame.setSize(new Dimension(fcot + fcot/20, fcot + fcot/5));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		}
	
}
