while [[ True ]]
do
	n=$(java DigitalIde)
	extension=${n:$(( ${#str}-1 )):1}
	if [[ "$extension" == 6 ]]
	then
		exit
	fi
	#echo "$n"
	c=$(./IdeComp.sh "$n")
	#echo $c
	#exit
	if [ "$c" -ge 0 ]
	then 
		r=$(./IdeRun.sh $c) 
		#echo $r
		#exit
		#echo "15"
		if [ "$r" -gt 0 ]
		then
			org=$(cat outorg)
			out=$(cat output)
			#echo "9"
			if [[ "$org" != "$out" ]]
			then 
				#echo "5"
				o=$(java DigitalIdeErr 0 1)
				if [[ "$o" == 1 ]]
					then 
						exit
				fi
			else
				a=$(java Correct)
				if [[ "$a" == 1 ]]
					then exit
				fi
			fi
		elif [[ "$r" == -1 ]]
		then 
			exit
		fi
	elif [[ "$c" == -1 ]]
	then 
		exit
	fi
done
