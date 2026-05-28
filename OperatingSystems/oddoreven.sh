echo "ENTER THE NUMBER"
read n
if [ $(( $n%2 )) -eq 0 ]
then
echo "THE NUMBER IS EVEN"
else
echo "THE NUMBER IS ODD"
fi 
