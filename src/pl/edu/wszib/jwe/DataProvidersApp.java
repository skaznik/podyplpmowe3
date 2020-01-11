package pl.edu.wszib.jwe;

public class DataProvidersApp {
    public static void main(String[] args) {
        //utworzenie nowego obiektu
        SimpleDataProvider dataProvider = new SimpleDataProvider();
        //wyświetlenie obiektu
        System.out.println(dataProvider.getData());
        // inny sposób
        DataProvider dataProvider1 = new SimpleDataProvider();
        System.out.println(dataProvider1.getData());
        //wykorzystanie clasy DataPrezenter do wyświetlania danych
        DataProvider dataProvider2 = new SimpleDataProvider();
        DataPresenter dataPresenter = new DataPresenter();
        dataPresenter.showData(dataProvider2);

        DataProvider dataProvider3 = new FileDataProvider();
        DataPresenter dataPresenter1 = new DataPresenter();
        dataPresenter1.showData(dataProvider3);

    }
}
