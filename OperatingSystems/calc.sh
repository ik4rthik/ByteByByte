x=1
while [ $x -eq 1 ]
do
	echo "ADDITION-1 
	 SUBSTRACTION-2
	   MULTIPLICATION-3  
	   DIVISION-4 
	   exit-5 (ENTER THE CHOICE)"
	read c
	echo "ENTER THE NUMBERS"
	read n1 n2
	case $c in
	1) echo $(($n1 + $n2));;
	2) echo $(($n1 - $n2));;
	3) echo $(($n1 * $n2));;
	4) echo $(($n1 / $n2));;
	5) x=0;;
	*) echo "INVALID CHOICE"
	esac
done
	
