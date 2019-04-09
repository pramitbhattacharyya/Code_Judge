#!/bin/bash
str=$1
extension=${str:$(( ${#str}-1 )):1}
code=${str::-1}
#echo  "$code"
case $extension in 
	3)			
		echo  "$code" > Main.c
		gcc Main.c -o Main	;;		
	4)		
		echo  "$code" > Main.cpp
		g++ Main.cpp -o Main	;;							
	1)
		echo  "$code" > Main.py;;		
	2)		
		echo  "$code" > Main.py;;				
	0)
		echo  "$code" > Main.java
		javac Main.java ;;
		#echo "Hi" > output		
	5)
		echo  "$code" > Main.sh
		chmod +x Main.sh ;;		
	*)
		echo "Cannot be compiled. Improper Language.";;
esac
#n=$(./CheckCompileErr.sh 0)
n=$(echo $?)
if [[ $n == 0 ]]
then
	echo $extension
else	
	s=$(java DigitalIdeErr 0 0)
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