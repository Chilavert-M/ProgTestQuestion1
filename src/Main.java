
void main() {
    //2D Arrays
    int[][] sales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};

    //1D Array
    String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria" };
    String[] consoles = {"PS5", "XBOX", "SWITCH"};

    //Totals
    int capeTownTotals = 0;
    int portElizabethTotals = 0;
    int pretoriaTotals = 0;

    System.out.println("-------------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("-------------------------------------------------------");

    System.out.printf("%-15s", " ");
    for (int console = 0; console < consoles.length; console++) {
        System.out.printf("%-15s", consoles[console]);
    }

    System.out.println();

    for (int city = 0; city < cities.length; city++) {
        System.out.printf("%-15s", cities[city]);

        //Total
        int citiesTotal = 0;

        for (int console = 0; console < sales[city].length; console++) {
            System.out.printf("%-15s", sales[city][console]);

            citiesTotal += sales[city][console];
        }
        //Totals calculations
        if (city == 0){
            capeTownTotals = citiesTotal;
        } else if (city == 1) {
            portElizabethTotals = citiesTotal;
        } else if (city == 2) {
            pretoriaTotals = citiesTotal;
        }
        System.out.println();


    }

    System.out.println("---------------------------------------------------------");
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println("---------------------------------------------------------");

    System.out.println("CAPE TOWN: " + capeTownTotals);
    System.out.println("PORT ELIZABETH: " + portElizabethTotals);
    System.out.println("PRETORIA: " + pretoriaTotals);

    System.out.println();
    System.out.print("CITY WITH THE MOST SALES: ");
    if(capeTownTotals > portElizabethTotals && capeTownTotals > pretoriaTotals){
        System.out.println("CAPE TOWN");

    } else if (portElizabethTotals > capeTownTotals && portElizabethTotals > pretoriaTotals) {
        System.out.println("PORT ELIZABETH");
    }else {
        System.out.println("PRETORIA");
    }

}
