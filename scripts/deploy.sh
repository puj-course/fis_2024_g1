
read -p "Dijite y/n si quiere o no hacer un deploy: " opc

if [[ "$opc" == "y" ]]; then
  echo "Usted a seleccionado la opcion \"deploy\""
  chmod +x ./scripts/setup.sh
  ./scripts/setup.sh
  ./scripts/test.sh
elif [[ "$opc" == "n" ]]; then
  echo "El deploy se cancela"
else 
  echo "Usted dijito una opcion no valida. El deploy no se puede realizar"
fi
