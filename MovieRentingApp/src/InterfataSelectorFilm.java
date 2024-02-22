import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class InterfataSelectorFilm extends Frame{
    Button bInapoi,bReset;
    Panel p1,p2;
    Label l1,l2;
    TextField t1;
    ArrayList<String>filme_selectate = new ArrayList<String>();
    CitireFilme cf = new CitireFilme();
    //ArrayList<ArrayList<String>>confirmari = new ArrayList<ArrayList<String>>();

    InterfataSelectorFilm(){
        super("Selectie copii film");
        p1 = new Panel();
        p2 = new Panel();
        l1 = new Label();
        l2 = new Label("Introdu codul unic trimis");
        t1 = new TextField(15);
        bInapoi = new Button("Inapoi la tab-ul cu filme");
        bReset = new Button("Trimite codul unic din nou");
        AscultatorSelector ab = new AscultatorSelector();
        p1.setSize(400,500);
        p2.setSize(400,500);
        p1.add(l1);
        p2.add(l2);
        p2.add(t1);

        p2.add(bInapoi);
        p2.add(bReset);        
        bInapoi.addActionListener(ab);
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent
        ev){System.exit(0);}});

    }

    class AscultatorSelector implements ActionListener{
        
        
        int dim = cf.Filme.size();
        public void actionPerformed(ActionEvent ev){
            CitireFilme cf = new CitireFilme();
            cf.citeste("filme.txt");
            int dim = cf.Filme.size();
            
            //for(int i = 0 ; i < dim ; i++){
            if(ev.getSource() == bInapoi){
                
                //filme_selectate.add(cf.Filme.get(i).numeFilm);
                setVisible(false); 
                //film.add(cf.Filme.get(i).numeFilm);
                //System.out.print(filme_selectate);
                
            }
        //}
        
    }
}
}