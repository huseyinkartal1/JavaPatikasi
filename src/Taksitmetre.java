
/*

Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/

double gidilenMesafe=20.00;
double kmUcreti=2.20d;
double acilisUcreti=10.00d;

double tutar=gidilenMesafe*kmUcreti+acilisUcreti;

if(tutar<20.00) tutar=20.00;

System.out.println(tutar);
