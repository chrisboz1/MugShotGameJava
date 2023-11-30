package FinalProjectStuff;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.Random;

public class mugshots 
{   
    public static void main(String args[]) throws IOException
    {
        String theFiveCrimes[] = new String[5];
        BufferedImage theFiveMugshots[] = new BufferedImage[5];

        //path names won't work on other devices

        BufferedImage mugshot1 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot1.jpg"));
        BufferedImage mugshot2 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot2.jpg"));
        BufferedImage mugshot3 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot3.jpg"));
        BufferedImage mugshot4 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot4.jpg"));
        BufferedImage mugshot5 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot5.jpg"));
        BufferedImage mugshot6 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot6.jpg"));
        BufferedImage mugshot7 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot7.jpg"));
        BufferedImage mugshot8 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot8.jpg"));
        BufferedImage mugshot9 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot9.jpg"));
        BufferedImage mugshot10 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot10.jpg"));
        BufferedImage mugshot11 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot11.jpg"));
        BufferedImage mugshot12 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot12.jpg"));
        BufferedImage mugshot13 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot13.jpg"));
        BufferedImage mugshot14 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot14.jpg"));
        BufferedImage mugshot15 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot15.jpg"));
        BufferedImage mugshot16 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot16.jpg"));
        BufferedImage mugshot17 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot17.jpg"));
        BufferedImage mugshot18 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot18.jpg"));
        BufferedImage mugshot19 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot19.jpg"));
        BufferedImage mugshot20 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot20.jpg"));
        BufferedImage mugshot21 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot21.jpg"));
        BufferedImage mugshot22 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot22.jpg"));
        BufferedImage mugshot23 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot23.jpg"));
        BufferedImage mugshot24 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot24.jpg"));
        BufferedImage mugshot25 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot25.jpg"));
        BufferedImage mugshot26 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot26.jpg"));
        BufferedImage mugshot27 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot27.jpg"));
        BufferedImage mugshot28 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot28.jpg"));
        BufferedImage mugshot29 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot29.jpg"));
        BufferedImage mugshot30 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot30.jpg"));
        BufferedImage mugshot31 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot31.jpg"));
        BufferedImage mugshot32 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot32.jpg"));
        BufferedImage mugshot33 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot33.jpg"));
        BufferedImage mugshot34 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot34.jpg"));
        BufferedImage mugshot35 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot35.jpg"));
        BufferedImage mugshot36 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot36.jpg"));
        BufferedImage mugshot37 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot37.jpg"));
        BufferedImage mugshot38 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot38.jpg"));
        BufferedImage mugshot39 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot39.jpg"));
        BufferedImage mugshot40 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot40.jpg"));
        BufferedImage mugshot41 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot41.jpg"));
        BufferedImage mugshot42 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot42.jpg"));
        BufferedImage mugshot43 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot43.jpg"));
        BufferedImage mugshot44 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot44.jpg"));
        BufferedImage mugshot45 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot45.jpg"));
        BufferedImage mugshot46 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot46.jpg"));
        BufferedImage mugshot47 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot47.jpg"));
        BufferedImage mugshot48 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot48.jpg"));
        BufferedImage mugshot49 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot49.jpg"));
        BufferedImage mugshot50 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot50.jpg"));
        BufferedImage mugshot51 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot51.jpg"));
        BufferedImage mugshot52 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot52.jpg"));
        BufferedImage mugshot53 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot53.jpg"));
        BufferedImage mugshot54 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot54.jpg"));
        BufferedImage mugshot55 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot55.jpg"));
        BufferedImage mugshot56 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot56.jpg"));
        BufferedImage mugshot57 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot57.jpg"));
        BufferedImage mugshot58 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot58.jpg"));
        BufferedImage mugshot59 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot59.jpg"));
        BufferedImage mugshot60 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot60.jpg"));
        BufferedImage mugshot61 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot61.jpg"));
        BufferedImage mugshot62 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot62.jpg"));
        BufferedImage mugshot63 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot63.jpg"));
        BufferedImage mugshot64 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot64.jpg"));
        BufferedImage mugshot65 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot65.jpg"));
        BufferedImage mugshot66 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot66.jpg"));
        BufferedImage mugshot67 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot67.jpg"));
        BufferedImage mugshot68 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot68.jpg"));
        BufferedImage mugshot69 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot69.jpg"));
        BufferedImage mugshot70 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot70.jpg"));
        BufferedImage mugshot71 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot71.jpg"));
        BufferedImage mugshot72 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot72.jpg"));
        BufferedImage mugshot73 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot73.jpg"));
        BufferedImage mugshot74 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot74.jpg"));
        BufferedImage mugshot75 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot75.jpg"));
        BufferedImage mugshot76 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot76.jpg"));
        BufferedImage mugshot77 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot77.jpg"));
        BufferedImage mugshot78 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot78.jpg"));
        BufferedImage mugshot79 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot79.jpg"));
        BufferedImage mugshot80 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot80.jpg"));
        BufferedImage mugshot81 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot81.jpg"));
        BufferedImage mugshot82 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot82.jpg"));
        BufferedImage mugshot83 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot83.jpg"));
        BufferedImage mugshot84 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot84.jpg"));
        BufferedImage mugshot85 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot85.jpg"));
        BufferedImage mugshot86 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot86.jpg"));
        BufferedImage mugshot87 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot87.jpg"));
        BufferedImage mugshot88 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot88.jpg"));
        BufferedImage mugshot89 = ImageIO.read(new File("FinalProjectStuff\\MugshotPictures\\mugshot89.jpg"));

        BufferedImage[] arrayOfMugshots ={mugshot1, mugshot2, mugshot3, mugshot4, mugshot5, mugshot6, mugshot7, mugshot8, mugshot9, mugshot10,
        mugshot11, mugshot12, mugshot13, mugshot14, mugshot15, mugshot16, mugshot17, mugshot18, mugshot19, mugshot20, mugshot21, mugshot22,
        mugshot23, mugshot24, mugshot25, mugshot26, mugshot27, mugshot28, mugshot29, mugshot30, mugshot31, mugshot32, mugshot33, mugshot34,
        mugshot35, mugshot36, mugshot37, mugshot38, mugshot39, mugshot40, mugshot41, mugshot42, mugshot43, mugshot44, mugshot45, mugshot46,
        mugshot47, mugshot48, mugshot49, mugshot50, mugshot51, mugshot52, mugshot53, mugshot54, mugshot55, mugshot56, mugshot57, mugshot58,
        mugshot59, mugshot60, mugshot61, mugshot62, mugshot63, mugshot64, mugshot65, mugshot66, mugshot67, mugshot68, mugshot69, mugshot70,
        mugshot71, mugshot72, mugshot73, mugshot74, mugshot75, mugshot76, mugshot77, mugshot78, mugshot79, mugshot80, mugshot81, mugshot82,
        mugshot83, mugshot84, mugshot85, mugshot86, mugshot87, mugshot88, mugshot89};

        // how to avoid repeating code

        HashMap<Integer, String> mugshotsAndCrimes = new HashMap<>();
        mugshotsAndCrimes.put(1, "Domestic assault");
        mugshotsAndCrimes.put(2, "Drug intoxication");
        mugshotsAndCrimes.put(3, "4th degree assault");
        mugshotsAndCrimes.put(4, "Parole Violation");
        mugshotsAndCrimes.put(5, "4th degree domestic assault");
        mugshotsAndCrimes.put(6, "Resisting arrest");
        mugshotsAndCrimes.put(7, "1st degree harassment");
        mugshotsAndCrimes.put(8, "Stealing");
        mugshotsAndCrimes.put(9, "Endangering the welfare of a child");
        mugshotsAndCrimes.put(10, "Possession of drug paraphernalia");
        mugshotsAndCrimes.put(11, "Stealing");
        mugshotsAndCrimes.put(12, "Possession of controlled substance");
        mugshotsAndCrimes.put(13, "Possession of controlled substance");
        mugshotsAndCrimes.put(14, "Possession of controlled substance");
        mugshotsAndCrimes.put(15, "Delivery of controlled substance");
        mugshotsAndCrimes.put(16, "Possession of controlled substance");
        mugshotsAndCrimes.put(17, "4th degree domestic assault");
        mugshotsAndCrimes.put(18, "Possession of controlled substance");
        mugshotsAndCrimes.put(19, "Child molestation");
        mugshotsAndCrimes.put(20, "2nd degree domestic assault");
        mugshotsAndCrimes.put(21, "1st degree arson");
        mugshotsAndCrimes.put(22, "Statutory rape");
        mugshotsAndCrimes.put(23, "Parole violation");
        mugshotsAndCrimes.put(24, "Parole violation");
        mugshotsAndCrimes.put(25, "Child endangerment");
        mugshotsAndCrimes.put(26, "2nd degree domestic assault");
        mugshotsAndCrimes.put(27, "Possession of controlled substance");
        mugshotsAndCrimes.put(28, "Failure to register as sex offender");
        mugshotsAndCrimes.put(29, "1st degree sexual abuse");
        mugshotsAndCrimes.put(30, "4th degree assault");
        mugshotsAndCrimes.put(31, "Court commit");
        mugshotsAndCrimes.put(32, "Court commit");
        mugshotsAndCrimes.put(33, "Stealing");
        mugshotsAndCrimes.put(34, "Court commit");
        mugshotsAndCrimes.put(35, "Court commit");
        mugshotsAndCrimes.put(36, "Property damage");
        mugshotsAndCrimes.put(37, "Statutory sodomy");
        mugshotsAndCrimes.put(38, "Court commit");
        mugshotsAndCrimes.put(39, "2nd degree domestic assault");
        mugshotsAndCrimes.put(40, "Tampering with property of another");
        mugshotsAndCrimes.put(41, "Property damage");
        mugshotsAndCrimes.put(42, "Court commit");
        mugshotsAndCrimes.put(43, "Court commit");
        mugshotsAndCrimes.put(44, "3rd degree assault");
        mugshotsAndCrimes.put(45, "Driving without license and running stop sign");
        mugshotsAndCrimes.put(46, "Seducing a woman");
        mugshotsAndCrimes.put(47, "Stabbing");
        mugshotsAndCrimes.put(48, "Pistol-whipping");
        mugshotsAndCrimes.put(49, "DUI");
        mugshotsAndCrimes.put(50, "Marijuana possession");
        mugshotsAndCrimes.put(51, "DUI");
        mugshotsAndCrimes.put(52, "Missing required drug tests");
        mugshotsAndCrimes.put(53, "Possession of concealed weapon");
        mugshotsAndCrimes.put(54, "Drag-racing");
        mugshotsAndCrimes.put(55, "Protesting");
        mugshotsAndCrimes.put(56, "Probation violation");
        mugshotsAndCrimes.put(57, "Felony cocaine possession");
        mugshotsAndCrimes.put(58, "Probation violation");
        mugshotsAndCrimes.put(59, "Amphetamine possession");
        mugshotsAndCrimes.put(60, "Dangling from a bridge and flashing drivers");
        mugshotsAndCrimes.put(61, "Spousal abuse");
        mugshotsAndCrimes.put(62, "Driving without a license");
        mugshotsAndCrimes.put(63, "Felony charges of selling heroin and crack cocaine");
        mugshotsAndCrimes.put(64, "Felony cocaine possession");
        mugshotsAndCrimes.put(65, "DUI");
        mugshotsAndCrimes.put(66, "Murder");
        mugshotsAndCrimes.put(67, "Outstanding bench warrant");
        mugshotsAndCrimes.put(68, "Reckless driving");
        mugshotsAndCrimes.put(69, "Assault");
        mugshotsAndCrimes.put(70, "Sexual assault");
        mugshotsAndCrimes.put(71, "Trespassing");
        mugshotsAndCrimes.put(72, "Speeding");
        mugshotsAndCrimes.put(73, "Suspected arson");
        mugshotsAndCrimes.put(74, "DUI");
        mugshotsAndCrimes.put(75, "Disorderly conduct");
        mugshotsAndCrimes.put(76, "Criminal destruction of property");
        mugshotsAndCrimes.put(77, "Petty theft");
        mugshotsAndCrimes.put(78, "DUI");
        mugshotsAndCrimes.put(79, "Carrying concealed/stolen firearm");
        mugshotsAndCrimes.put(80, "Drug trafficking");
        mugshotsAndCrimes.put(81, "Failing to appear in court");
        mugshotsAndCrimes.put(82, "In violation of laws governing sexually oriented businesses");
        mugshotsAndCrimes.put(83, "Drug charges");
        mugshotsAndCrimes.put(84, "Drug lord");
        mugshotsAndCrimes.put(85, "Mobster");
        mugshotsAndCrimes.put(86, "Mafia");
        mugshotsAndCrimes.put(87, "Terrorism");
        mugshotsAndCrimes.put(88, "Advocating for violent strikes");
        mugshotsAndCrimes.put(89, "Domestic assault");
        
        for (int i = 0; i < 5; i++)
        {
            Random rand = new Random();
            int random = rand.nextInt(89);

            String s = mugshotsAndCrimes.get(random + 1);
            theFiveCrimes[i] = s;

            theFiveMugshots[i] = arrayOfMugshots[random];
        }
        
        JLabel m1 = new JLabel(new ImageIcon(theFiveMugshots[0]));
        JPanel jPanel = new JPanel();
        jPanel.add(m1);
        JFrame f = new JFrame();
        f.setSize(1000, 1000);
        f.add(jPanel);
        f.setVisible(true);
    }
}
