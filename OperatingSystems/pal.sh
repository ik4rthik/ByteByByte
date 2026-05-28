echo "ENTER THE NUMBER: "
read n
pal=0
i=n
while [ $(($i%10)) -gt 0 ]
do
	d=$(($i%10))
	pal=$(( $(($pal*10)) +$d ))
	i=$(($i/10))
done
if [ $pal -eq $n ]
then
	echo "THE NUMBER IS PALINDROME"
else
	echo "THE NUMBER IS NOT PALINDROME"
fi
