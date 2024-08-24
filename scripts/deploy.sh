
read -p "Dijite 1 si quiere hacer un deploy: " opc

if [ opc -eq 1 ]
then
  echo "Usted a seleccionado la opcion \"deploy\""
  make all
  mv ../src/main/java/*.class ..; java Main;
else
  echo "Usted a dijito una opcion no valida. El deploy se cancela"
fi