#!/bin/bash
extension=$1
case $extension in 
	3)			
		./Main < input > output;;
	4)		
		./Main < input > output;;					
	1)		
		python3 Main.py < input > output;;		
	2)				
		python Main,py < input > output;;  
	0)		
		java Main < input > output;;
	5)		
		./Main.sh < input > output;;
	*)
		echo "Cannot be compiled. Improper extension.";;
esac
#n=$(./CheckCompileError 1)
n=$(echo $?)
if [[ $n == 0 ]]
then
	echo "1"
else	
	s=$(java DigitalIdeErr 1 0)
	if [[ $s == 0 ]]		
		then echo "-2"	# back to main.sh
	else 
		echo "-1"
	fi		
fi
# case $n in 
# 	-1) echo "-1";;	# return to main
# 	 4) echo "4";; # Exit
# 	 0) echo "0";; # Run
# esac