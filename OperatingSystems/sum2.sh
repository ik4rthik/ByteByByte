echo "ENTER THE NUMBER: "
read n
sum=0
while [ $n -gt 0 ]
do
	d=$(($n%10))
	sum=$(($sum+$d))
	n=$(($n/10))
done

echo "THE SUM= $sum"

