package accounting.software;

import accounting.software.GUIStaffs.DieselDialog;
import accounting.software.GUIStaffs.ExpensePanel;
import accounting.software.GUIStaffs.IncomePanel;
import accounting.software.GUIStaffs.PersonnelPanel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.*;

/**
 *
 * @author Ahmet Alperen Bulut
 * @author Arif Dogru
 */
public class AccountingSystem {

    // Lists of Classes
    private List<Personnel> personnelList = new ArrayList();
    private List<Fuel> fuelList = new ArrayList();
    private List<Sales> salesList = new ArrayList();
    private List<OtherExpense> otherExpenseList = new ArrayList();

    // For Gui
    private List<PersonnelPanel> personnelPanelList = new ArrayList();
    private List<IncomePanel> incomePanelList = new ArrayList();
    private List<ExpensePanel> expensePanelList = new ArrayList();

    // For Json
    private JSONObject jsonObject = new JSONObject();
    private JsonParser jsonParser = new JsonParser();

    private static final AccountingSystem INSTANCE = new AccountingSystem();

    private AccountingSystem() {
    }

    /**
     *
     * @return instance
     */
    public static AccountingSystem getInstance() {
        return INSTANCE;
    }

    /**
     * @param index
     * @return OtherExpense object
     */
    public OtherExpense getOtherExpense(int index) {
        if (index >= otherExpenseList.size()) {
            return null;
        }
        return otherExpenseList.get(index);
    }

    /**
     *
     * @param index
     * @return saleClass object
     */
    public Sales getSale(int index) {
        if (index >= salesList.size()) {
            return null;
        }
        return salesList.get(index);
    }

    /**
     *
     * @param index
     * @return Person object
     */
    public Personnel getPerson(int index) {
        if (index >= personnelList.size()) {
            return null;
        }
        return personnelList.get(index);

    }

    /**
     *
     * @param saleID
     * @return Sale object
     */
    public Sales getSaleById(int saleID) {

        for (int i = 0; i < salesList.size(); ++i) {
            if (salesList.get(i).getID() == saleID) {
                return salesList.get(i);
            }
        }

        return null;
    }

    /**
     *
     * @param personId
     * @return person object
     */
    public Personnel getPersonById(int personId) {

        for (int i = 0; i < personnelList.size(); ++i) {
            if (personnelList.get(i).getId() == personId) {
                return personnelList.get(i);
            }
        }

        return null;
    }
    
    /**
     *
     * @param index
     * @return fuel object
     */
    public Fuel getFuel(int index) {
        if (index >= fuelList.size()) {
            return null;
        }

        return fuelList.get(index);
    }

    /**
     *
     * @return otherExpenseListt list size
     */
    public int getOtherExpenseSize() {
        return otherExpenseList.size();
    }

    /**
     *
     * @return sales list size
     */
    public int getSalesListSize() {
        return salesList.size();
    }

    /**
     *
     * @return personnel list size
     */
    public int getPersonnelSize() {
        return personnelList.size();
    }

    /**
     *
     * @return fuel list size
     */
    public int getFuelSize() {
        return fuelList.size();
    }

    /**
     * @param newOtherExpense
     */
    public void addOtherExpense(OtherExpense newOtherExpense) {
        boolean duplicate = false;
        for (int i = 0; i < otherExpenseList.size(); i++) {
            if (otherExpenseList.get(i).getDate() == newOtherExpense.getDate()
                    && otherExpenseList.get(i).getDescription() == newOtherExpense.getDescription()) {
                duplicate = true;
            }
        }
        if (!duplicate) {
            otherExpenseList.add(newOtherExpense);
        }
    }

    /**
     *
     * @param newSale
     */
    public void addSale(Sales newSale) {
        boolean duplicate = false;
        for (int i = 0; i < salesList.size(); ++i) {
            if (salesList.get(i).getID() == newSale.getID()) {
                duplicate = true;
            }
        }
        if (!duplicate) {
            salesList.add(newSale);
        }
    }

    /**
     *
     * @param newPerson
     */
    public boolean addPerson(Personnel newPerson) {
        boolean duplicate = false;
        for (int i = 0; i < personnelList.size(); ++i) {
            if (personnelList.get(i).getId() == newPerson.getId()) {
                duplicate = true;
            }
        }
        if (!duplicate) {
            personnelList.add(newPerson);
        }
        return !duplicate;
    }

    /**
     *
     * @param date
     * @param desc
     */
    public void removeOtherExpense(Date date, String desc) {
        for (int i = 0; i < otherExpenseList.size(); i++) {
            if (otherExpenseList.get(i).getDescription().equals(desc)
                    && otherExpenseList.get(i).getDate().equals(date)) {
                otherExpenseList.remove(i);
            }
        }
    }

    /**
     *
     * @param id
     */
    public void removeSale(int id) {
        for (int i = 0; i < salesList.size(); ++i) {
            if (salesList.get(i).getID() == id) {
                salesList.remove(i);
            }
        }

    }
    
        /**
     *
     * @param id
     */
    public void removePerson(int id) {
        for (int i = 0; i < personnelList.size(); ++i) {
            if (personnelList.get(i).getId() == id) {
                personnelList.remove(i);
            }
        }

    }


    /**
     *
     * @param id
     */
    public void removeOtherExpense(int id) {
        for (int i = 0; i < otherExpenseList.size(); ++i) {
            if (otherExpenseList.get(i).getID() == id) {
                otherExpenseList.remove(i);
            }
        }

    }

    /**
     *
     * @param newFuel
     */
    public void addFuel(Fuel newFuel) {
     
       fuelList.add(newFuel);
    }

    /**
     *Kullanmayınız biten petrol türü otomatik olarak silinir..
     * @param fuelType
     */
    public boolean removeAllFuel(String fuelType) {
        boolean returnValue=false;
        for (int i = 0; i < fuelList.size(); ++i) {
            if (fuelList.get(i).getFuelType().equals(fuelType)) {
                fuelList.remove(i);
                returnValue=true;
            }
        }
        return returnValue;
    }
    public boolean removeFuel(){
        boolean returnValue=false;
             for(int i=0;i<fuelList.size();++i){
               if((fuelList.get(i).getBuyingAmount()-fuelList.get(i).getSaleAmount())==0){
                 fuelList.remove(i);
                 returnValue=true;
           }
       }
               return returnValue;
    }
    public boolean saleFuel(String fuelType,double saleAmount){
         boolean returnValue=false;
        for(int i=0;i<fuelList.size();++i){
            if(fuelList.get(i).getName().equals(fuelType) && saleAmount>0.0){
               if((fuelList.get(i).getBuyingAmount()-fuelList.get(i).getSaleAmount())>=saleAmount){
                   fuelList.get(i).setSaleAmount(fuelList.get(i).getSaleAmount()+saleAmount);
                   returnValue=true;
                   break;
               }
               else{
                   saleAmount=saleAmount-(fuelList.get(i).getBuyingAmount()-fuelList.get(i).getSaleAmount());
                   fuelList.get(i).setSaleAmount(fuelList.get(i).getBuyingAmount());
                   returnValue=true;
               }
            }
        }
         return returnValue;
    }
    /*
     * @return String : system date with format(dd/MM/yyyy )    
     */
    public String systemDate() {
        Date systemDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(systemDate);
        return date;
    }

    /**
     *
     * @param index
     * @return
     */
    public PersonnelPanel getPersonnelPanel(int index) {
        if (index >= personnelPanelList.size()) {
            return null;
        }
        return personnelPanelList.get(index);
    }

    /**
     *
     * @param newPersonnelPanel
     */
    public void addPersonnelPanel(PersonnelPanel newPersonnelPanel) {
        boolean duplicate = false;
        for (int i = 0; i < personnelPanelList.size(); ++i) {
            if (personnelPanelList.get(i).getPersonnelPanelID() == newPersonnelPanel.getPersonnelPanelID()) {
                duplicate = true;
            }
        }
        if (!duplicate) {
            personnelPanelList.add(newPersonnelPanel);
        }
    }

    /**
     *
     * @param index
     */
    public void removePersonnelPanel(int index) {
        for (int i = 0; i < personnelPanelList.size(); ++i) {
            personnelPanelList.remove(i);
        }

    }

    /**
     *
     * @param index
     * @return
     */
    public IncomePanel getIncomePanel(int index) {
        if (index >= incomePanelList.size()) {
            return null;
        }
        return incomePanelList.get(index);
    }

    /**
     *
     * @param newIncomePanel
     */
    public void addIncomePanel(IncomePanel newIncomePanel) {
        boolean duplicate = false;
        for (int i = 0; i < incomePanelList.size(); ++i) {
            if (incomePanelList.get(i).getIncomePanelID() == newIncomePanel.getIncomePanelID()) {
                duplicate = true;
            }
        }
        if (!duplicate) {
            incomePanelList.add(newIncomePanel);
        }
    }

    /**
     *
     * @param index
     */
    public void removeIncomePanel(int index) {
        for (int i = 0; i < incomePanelList.size(); ++i) {
            incomePanelList.remove(i);
        }

    }

    /**
     *
     * @param index
     * @return
     */
    public ExpensePanel getExpensePanel(int index) {
        if (index >= expensePanelList.size()) {
            return null;
        }
        return expensePanelList.get(index);
    }

    /**
     *
     * @param newExpensePanel
     */
    public void addExpensePanel(ExpensePanel newExpensePanel) {
        boolean duplicate = false;
        for (int i = 0; i < expensePanelList.size(); ++i) {
            if (expensePanelList.get(i).getExpensePanelID() == newExpensePanel.getExpensePanelID()) {
                duplicate = true;
            }
        }
        if (!duplicate) {
            expensePanelList.add(newExpensePanel);
        }
    }

    /**
     *
     * @param index
     */
    public void removeExpensePanel(int index) {
        for (int i = 0; i < expensePanelList.size(); ++i) {
            expensePanelList.remove(i);
        }

    }

    /**
     *
     * @return
     */
    public JSONObject getJsonObject() {
        return jsonObject;
    }

    /**
     *
     * @throws JSONException
     */
    public void generateJson() throws JSONException {
        
        jsonObject.put("Personnel", jsonParser.JSONEncode((List<Object>) (Object) personnelList));

        jsonObject.put("Fuels", jsonParser.JSONEncode((List<Object>) (Object) fuelList));

        jsonObject.put("Sales",  jsonParser.JSONEncode((List<Object>) (Object) salesList));

        jsonObject.put("OtherExpense", jsonParser.JSONEncode((List<Object>) (Object) otherExpenseList));


        System.out.println(jsonObject.toString());


        jsonParser.writeJsonToFile(jsonObject);
    }

    /**
     *
     */
    public boolean readToJson() {
        List<List<Object>> allList = new ArrayList();

        try {
            allList = jsonParser.JSONDecode();
        } catch (Exception e) {
            System.err.println("Dosya açılamadı: " + e);
            return false;
        }

        for (List<Object> anyList : allList) {
            if (anyList instanceof ArrayList) {
                for (Object obj : anyList) {
                    if (obj instanceof Personnel) {
                        personnelList.add((Personnel) obj);
                    } else if (obj instanceof Fuel) {
                        fuelList.add((Fuel) obj);
                    } else if (obj instanceof Sales) {
                        salesList.add((Sales) obj);
                    } else if (obj instanceof OtherExpense) {
                        otherExpenseList.add((OtherExpense) obj);
                    } else {
                        System.err.println("Unknown class type");
                    }
                }
            }
        }
        return true;
    }

    /**
     * determines the profit
     *
     * @return double
     *
     */
    public double getProfit() {
        double totalProfit = 0.0;
        for(Sales salesObj : salesList){
            
                totalProfit += salesObj.getPrice();
        }
        
        for(OtherExpense expObj : otherExpenseList){
            totalProfit -= expObj.getExpense();
        }
        for(Personnel personObj : personnelList){
            totalProfit -= personObj.getExpense();
        }
        return totalProfit;
    }

    /**
     *
     * @return guncel fiyata erisilemediyse 0.0 guncel fiyat * (fuelBuyingAmount -
     * fuelSalesAmount ) sahip olunan yakıttan o gun fiyatiyla sahip olunacak servet
     */
    public double calculateAssets() {
        double assets = 0.0;
        double gasolineCurrentPrice, dieselCurrentPrice, lpgCurrentPrice;
        TakeDataOnline prices = new TakeDataOnline();
        
        try {
            if (prices.getStateInternet()) {
                prices.urlParser();
                gasolineCurrentPrice = prices.getGasoline();
                dieselCurrentPrice = prices.getDiesel();
                lpgCurrentPrice = prices.getLpg();
            } else {
                return 0.0;
                //There is no internet connection. So should show info for user.  
            }
            for (int i = 0; i < fuelList.size(); i++) {
                if (fuelList.get(i).getFuelType().compareTo("GASOLINE") == 0) {
                    assets += ((fuelList.get(i).getBuyingAmount()- fuelList.get(i).getSaleAmount()) * gasolineCurrentPrice);
                } else if (fuelList.get(i).getFuelType().compareTo("DIESEL") == 0) {
                    assets += ((fuelList.get(i).getBuyingAmount()- fuelList.get(i).getSaleAmount()) * dieselCurrentPrice);
                } else {
                    assets += ((fuelList.get(i).getBuyingAmount()- fuelList.get(i).getSaleAmount()) * lpgCurrentPrice);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return assets;
    }

    // For PDF File 
    /* 
     * this report has information of fuel ,personel , incomes , expenses and assets  
     * @throws DocumentException , IOException
     */
    public static void createReport() throws DocumentException, IOException {

        Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 25, Font.BOLD);
        Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
        Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

        //create document
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("AccountingSoftware/AccountingSoftwareReport.pdf"));
        document.open();
        Paragraph preface = new Paragraph();

        // big header
        preface.add(new Paragraph("             Report Of Accounting System", catFont));
        // Report Date
        preface.add(new Paragraph(
                "                              Date : "
                + new Date(), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                smallBold));

        document.add(preface);
        Paragraph paragraph = new Paragraph();
        paragraph.add(new Paragraph(" "));
        document.add(paragraph);
        // Table for fuel 
        Paragraph fuelTitle = new Paragraph();
        fuelTitle.add(new Paragraph("                   FUEL", subFont));
        document.add(fuelTitle);
        document.add(paragraph);
        PdfPTable tableFuel = new PdfPTable(2);
        String gasolineS, dieselS, lpgS;
        TakeDataOnline prices = new TakeDataOnline();
        
        if (prices.getStateInternet()) {
            prices.urlParser();
            double gasoline = prices.getGasoline();
            double diesel = prices.getDiesel();
            double lpg = prices.getLpg();
            gasolineS = "" + gasoline;
            dieselS = "" + diesel;
            lpgS = "" + lpg;
        } else {
            gasolineS = "No Internet Connection";
            dieselS = "No Internet Connection";
            lpgS = "No Internet Connection";
            //There is no internet connection. So should show info for user.  
        }

        for (int i = 0; i < INSTANCE.getFuelSize(); i++) {
            tableFuel.addCell(INSTANCE.getFuel(i).getFuelType());
            tableFuel.addCell("");
            tableFuel.addCell("Available  Amount(lt)");
            tableFuel.addCell(("" + INSTANCE.getFuel(i).getBuyingAmount()));
            tableFuel.addCell("Purchase Price(TL)");
            tableFuel.addCell("" + INSTANCE.getFuel(i).getBuyingPrice());
            tableFuel.addCell("Current Price(TL)");
            if (INSTANCE.getFuel(i).getFuelType().equals("GASOLINE")) {
                
                tableFuel.addCell(gasolineS);
                
            } else if (INSTANCE.getFuel(i).getFuelType().equals("DIESEL") ) {
                
                tableFuel.addCell(dieselS);
                
            } else {
                
                tableFuel.addCell(lpgS);
                
            }
        }
        document.add(tableFuel);
        ///////////////////////////////////////////////
        document.add(paragraph);
        //Table for Personel
        Paragraph personnelTitle = new Paragraph();
        personnelTitle.add(new Paragraph("                   PERSONNEL", subFont));
        document.add(personnelTitle);
        document.add(paragraph);

        PdfPTable tablePersonel = new PdfPTable(5);
        tablePersonel.addCell("NAME");
        tablePersonel.addCell("LASTNAME");
        tablePersonel.addCell("JOB");
        tablePersonel.addCell("SALARY");
        tablePersonel.addCell("SSK PRIM");
        for (int i = 0; i < INSTANCE.getPersonnelSize(); i++) {
            tablePersonel.addCell(INSTANCE.personnelList.get(i).getName());
            tablePersonel.addCell(INSTANCE.personnelList.get(i).getLastName());
            tablePersonel.addCell(INSTANCE.personnelList.get(i).getJob());
            String salary = "" + (INSTANCE.personnelList.get(i).getSalary());
            tablePersonel.addCell(salary);
            String prim = "" + INSTANCE.personnelList.get(i).getSskBonus();
            tablePersonel.addCell(prim);
        }
        document.add(tablePersonel);

        ////////////////////////////////////////////////
        document.add(paragraph);
        //Table for Expenses
        Paragraph expensesTitle = new Paragraph();
        expensesTitle.add(new Paragraph("                   EXPENSES", subFont));
        document.add(expensesTitle);
        document.add(paragraph);

        PdfPTable tableExpenses = new PdfPTable(3);
        for (int i = 0; i < INSTANCE.otherExpenseList.size(); i++) {
            tableExpenses.addCell(INSTANCE.otherExpenseList.get(i).getName());
            tableExpenses.addCell(INSTANCE.otherExpenseList.get(i).getDescription() + "(TL)");
            tableExpenses.addCell("" + INSTANCE.otherExpenseList.get(i).getAmount());
        }
        document.add(tableExpenses);
        //////////////////////////////////////////////////
        document.add(paragraph);
        //Table for Incomes
        Paragraph incomeTitle = new Paragraph();
        incomeTitle.add(new Paragraph("                   INCOMES", subFont));
        document.add(incomeTitle);
        document.add(paragraph);
        PdfPTable tableIncomes = new PdfPTable(2);
        for (int i = 0; i < INSTANCE.getSalesListSize(); i++) {
            tableIncomes.addCell(INSTANCE.salesList.get(i).getDescription() + "(TL)");
            String priceSale = "" + INSTANCE.salesList.get(i).getPrice();
            tableIncomes.addCell(priceSale);
        }
        document.add(tableIncomes);

        // ASSETS
        DecimalFormat df2 = new DecimalFormat(".##");
        double assets = INSTANCE.calculateAssets();
        Paragraph assetsTitle = new Paragraph();
        assetsTitle.add(new Paragraph("                   ASSETS:  "+df2.format(assets) ,subFont));
        document.add(assetsTitle);
        
        // PROFIT
        double profit = INSTANCE.getProfit();
        
        Paragraph profitTitle = new Paragraph();
        profitTitle.add(new Paragraph("                   PROFIT:  "+df2.format(profit), subFont));
        document.add(profitTitle);
        document.close();
        //////////////////////////////////////////////////
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("AccountingSoftware/AccountingSoftwareReport.pdf");
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                // no application registered for PDFs
                System.out.println(" Pdf Can not Open");
            }
}
    }
}
