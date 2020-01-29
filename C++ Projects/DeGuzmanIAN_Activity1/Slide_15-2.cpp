#include <iostream>
#include <cmath>
using namespace std;

main()
{
	double rect_l, rect_w, rect_peri;
	double tri_b, tri_h, tri_area;
	double cyl_r, cyl_h, cyl_vol;
	double pi = 3.14159;
	
	cout << "Enter length of rectangle: ";
	cin >> rect_l;
	cout << "Enter width of rectangle: ";
	cin >> rect_w;
	cout << "Enter base of triangle: ";
	cin >> tri_b;
	cout << "Enter height of triangle: ";
	cin >> tri_h;
	cout << "Enter radius of cylinder: ";
	cin >> cyl_r;
	cout << "Enter height of cylinder: ";
	cin >> cyl_h;
	
	rect_peri = 2*(rect_l + rect_w);
	tri_area = (tri_b*tri_h) / 2;
	cyl_vol = pi * pow(cyl_r, 2) * cyl_h;
	
	cout << "\nPerimeter of rectangle: " << rect_peri << " Units";
	cout << "\nArea of Triangle: " << tri_area << " sq.Units";
	cout << "\nVolume of Cylinder: " << cyl_vol << " cubic units";
	
	
	
}
