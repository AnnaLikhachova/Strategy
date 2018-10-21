package Try.Second;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Play extends Application {
	Play scr;
	Warrior warrior;
	Stage primaryStage;
	Happyness happyness;
	Reader reader;
	Enemy enemy;
	private static int goldP = 500;
	private static int cultP = 100;
	private static int relP = 100;
	private static int scienP = 100;
	private static int goldK = 1;
	private static int cultK = 1;
	private static int relK = 1;
	private static int scieK = 1;
	private int soldier = 0;
	private int archer = 0;
	private int wizz = 0;
	private int enemyScore = 0;
	private int playerScore = 0;
	private URL url1 = this.getClass().getClassLoader().getResource("/Resources/screen.jpeg");
	private Image screen = new Image(getClass().getResourceAsStream("/Resources/screen.jpeg"));
	private Image b = new Image(getClass().getResourceAsStream("/Resources/Name.png"));
	private Image back = new Image(getClass().getResourceAsStream("/Resources/Ba1.png"));
	private Image arm = new Image(getClass().getResourceAsStream("/Resources/ar.png"));
	private Image scie = new Image(getClass().getResourceAsStream("/Resources/scien.png"));
	private Image sol = new Image(getClass().getResourceAsStream("/Resources/soldier.png"));
	private Image arch = new Image(getClass().getResourceAsStream("/Resources/archer.png"));
	private Image mg = new Image(getClass().getResourceAsStream("/Resources/mag.png"));
	private Image solIcon = new Image(getClass().getResourceAsStream("/Resources/swo.png"));
	private Image archIcon = new Image(getClass().getResourceAsStream("/Resources/bowi.png"));
	private Image buildi = new Image(getClass().getResourceAsStream("/Resources/h3.png"));
	private Image lib = new Image(getClass().getResourceAsStream("/Resources/library.png"));
	private Image far = new Image(getClass().getResourceAsStream("/Resources/farm.png"));
	private Image fore = new Image(getClass().getResourceAsStream("/Resources/forest.png"));
	private Image barr = new Image(getClass().getResourceAsStream("/Resources/barracks.png"));
	private Image min = new Image(getClass().getResourceAsStream("/Resources/mine.png"));
	private Image tem = new Image(getClass().getResourceAsStream("/Resources/temple.png"));
	private Image thea = new Image(getClass().getResourceAsStream("/Resources/theatre.png"));
	private Image lab = new Image(getClass().getResourceAsStream("/Resources/lab.png"));
	private Image ba = new Image(getClass().getResourceAsStream("/Resources/market.png"));
	private Image agricul = new Image(getClass().getResourceAsStream("/Resources/Agriculture.png"));
	private Image minin = new Image(getClass().getResourceAsStream("/Resources/Mining.png"));
	private Image writ = new Image(getClass().getResourceAsStream("/Resources/Writing.png"));
	private Image archerytech = new Image(getClass().getResourceAsStream("/Resources/Archery.png"));
	private Image curren = new Image(getClass().getResourceAsStream("/Resources/Currency.png"));
	private Image dram = new Image(getClass().getResourceAsStream("/Resources/Drama.png"));
	private Image philos = new Image(getClass().getResourceAsStream("/Resources/Philosophy.png"));
	private Image guil = new Image(getClass().getResourceAsStream("/Resources/Guilds.png"));
	private Image eng = new Image(getClass().getResourceAsStream("/Resources/Engineering.png"));
	private Image alex = new Image(getClass().getResourceAsStream("/Resources/Alex.jpg"));
	private Image alex2 = new Image(getClass().getResourceAsStream("/Resources/Alex 2.jpg"));
	private Image ahil = new Image(getClass().getResourceAsStream("/Resources/Ahil.jpg"));
	private Image ahil2 = new Image(getClass().getResourceAsStream("/Resources/Ahil 2.jpg"));
	private Image cesar = new Image(getClass().getResourceAsStream("/Resources/Cesar.jpg"));
	private Image cesar2 = new Image(getClass().getResourceAsStream("/Resources/Cesar 2.jpg"));
	private Image kleopatra = new Image(getClass().getResourceAsStream("/Resources/kleopatra.jpg"));
	private Image kleopatra2 = new Image(getClass().getResourceAsStream("/Resources/kleopatra 2.jpg"));
	private Image alex3 = new Image(getClass().getResourceAsStream("/Resources/Alex 3.jpg"));
	private Image ahil3 = new Image(getClass().getResourceAsStream("/Resources/Ahil 3.jpg"));
	private Image cesar3 = new Image(getClass().getResourceAsStream("/Resources/Cesar 3.jpg"));
	private Image kleopatra3 = new Image(getClass().getResourceAsStream("/Resources/kleopatra 3.jpg"));

	private Button alexb = new Button(null, new ImageView(alex3));
	private Button ahilb = new Button(null, new ImageView(ahil3));
	private Button cesarb = new Button(null, new ImageView(cesar3));
	private Button kleopatrab = new Button(null, new ImageView(kleopatra3));
	private static Button start1 = new Button("START GAME");
	private Button howtoplay = new Button("HOW TO PLAY");
	private Button options = new Button("SCORE TABLE");
	private Button quit = new Button("QUIT");
	private Button backtoMainMenu = new Button("BACK");
	private Button backtoMenu = new Button("BACK");
	private Button backtoPlayMenu = new Button("BACK");
	private Button war = new Button("LET'S BEGIN WAR");
	private Button backtoPlay = new Button(null, new ImageView(back));
	private Button armyb = new Button(null, new ImageView(arm));
	private Button scienceb = new Button(null, new ImageView(scie));
	private Button buildb = new Button(null, new ImageView(buildi));
	private Button ahilp = new Button("PLAY");
	private Button cesarp = new Button("PLAY");
	private Button alexp = new Button("PLAY");
	private Button kleopatrap = new Button("PLAY");
	private Button agriculture = new Button(null, new ImageView(agricul));
	private Button mining = new Button(null, new ImageView(minin));
	private Button writing = new Button(null, new ImageView(writ));
	private Button archery = new Button(null, new ImageView(archerytech));
	private Button currency = new Button(null, new ImageView(curren));
	private Button drama = new Button(null, new ImageView(dram));
	private Button philosophy = new Button(null, new ImageView(philos));
	private Button guild = new Button(null, new ImageView(guil));
	private Button engineering = new Button(null, new ImageView(eng));
	private Button library = new Button(null, new ImageView(lib));
	private Button forest = new Button(null, new ImageView(fore));
	private Button farm = new Button(null, new ImageView(far));
	private Button mine = new Button(null, new ImageView(min));
	private Button temple = new Button(null, new ImageView(tem));
	private Button theatre = new Button(null, new ImageView(thea));
	private Button laboratory = new Button(null, new ImageView(lab));
	private Button baracks = new Button(null, new ImageView(barr));
	private Button market = new Button(null, new ImageView(ba));
	private Button sword = new Button(null, new ImageView(sol));
	private Button bow = new Button(null, new ImageView(arch));
	private Button magik = new Button(null, new ImageView(mg));
	private Label sk = new Label();
	private Label ak = new Label();
	private Label mk = new Label();
	private Label l = new Label();
	private static Label golde = new Label();
	private static Label culturee = new Label();
	private static Label religione = new Label();
	private static Label sciencee = new Label();
	private String str = "";

	private boolean libB = false;
	private boolean farmB = false;
	private boolean forestB = false;
	private boolean mineB = false;
	private boolean theaB = false;
	private boolean tempB = false;
	private boolean markB = false;
	private boolean barrB = false;
	private boolean labB = false;

	private boolean agrB = false;
	private boolean minB = false;
	private boolean wriB = false;
	private boolean archB = false;
	private boolean curB = false;
	private boolean draB = false;
	private boolean philB = false;
	private boolean guilB = false;
	private boolean engB = false;

	private boolean cesarf = false;
	private boolean kleopatraf = false;
	private boolean ahilf = false;
	private boolean alexf = false;
	private static boolean clickS = false;
	private static boolean goldS = false;
	private boolean threadb = true;

	public void startTask() {
		Runnable task = new Runnable() {
			public void run() {
				runTask();
			}
		};
		Thread backgroundThread = new Thread(task);
		backgroundThread.setDaemon(true);
		backgroundThread.start();
	}

	public void soundTask() {
		Runnable task = new Runnable() {
			public void run() {
				Sounder sound = new Sounder();
				try {
					sound.playMainSound();
				} catch (MalformedURLException | InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread backgroundThread = new Thread(task);
		backgroundThread.setDaemon(true);
		backgroundThread.start();
	}

	public void runTask() {
		do {
			try {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						goldP += goldK;
						cultP += cultK;
						relP += relK;
						scienP += scieK;
						golde.setText(String.valueOf(goldP));
						culturee.setText(String.valueOf(cultP));
						religione.setText(String.valueOf(relP));
						sciencee.setText(String.valueOf(scienP));
						happyness.statusHappy(happyness.motionHappy(goldP, cultP, relP, scienP));
						happyness.raiseHappy(happyness.motionHappy(goldP, cultP, relP, scienP));
						enemyScore += enemy.enemyStrength();
						System.out.println("Счет врага  " + enemyScore);
						System.out.println("Счет игрока  " + playerScore);
					}
				});
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (threadb);
	}

	@Override
	public void start(Stage primaryStage)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
		System.out.println("Sound do starts");
		enemy = new Enemy(scr);
		soundTask();
		this.primaryStage = primaryStage;
		try {
			primaryStage.setScene(getScene());
			primaryStage.setMaximized(true);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
		initListeners();
	}

	public Scene getScene() {
		ImageView i1 = new ImageView(b);
		start1.setPrefSize(301, 50);
		start1.setId("Mainbuttons");
		howtoplay.setPrefSize(301, 50);
		howtoplay.setId("Mainbuttons");
		options.setPrefSize(301, 50);
		options.setId("Mainbuttons");
		quit.setPrefSize(301, 50);
		quit.setId("Mainbuttons");
		VBox hb = new VBox(5);
		hb.setAlignment(Pos.CENTER);
		hb.getChildren().add(start1);
		hb.getChildren().add(howtoplay);
		hb.getChildren().add(options);
		hb.getChildren().add(quit);
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setId("gridmain");
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(40, 40, 40, 40));
		Scene scene = new Scene(grid, 1440, 900);
		primaryStage.setFullScreen(true);
		grid.add(i1, 0, 0);
		grid.add(hb, 0, 1);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return scene;
	}

	public Scene getScenePlay(String str) {
		Pane canv = new Pane();
		Scene sceneplay = new Scene(canv, 1440, 900);
		startTask();

		if (libB == true) {
			ImageView libP = new ImageView(lib);
			libP.relocate(20, 500);
			canv.getChildren().addAll(libP);
		}
		if (forestB == true) {
			ImageView foreP = new ImageView(fore);
			foreP.relocate(250, 420);
			canv.getChildren().add(foreP);
		}
		if (farmB == true) {
			ImageView farP = new ImageView(far);
			farP.relocate(800, 400);
			canv.getChildren().add(farP);
		}
		if (mineB == true) {
			ImageView mineP = new ImageView(min);
			mineP.relocate(50, 400);
			canv.getChildren().add(mineP);
		}
		if (tempB == true) {
			ImageView temP = new ImageView(tem);
			temP.relocate(540, 310);
			canv.getChildren().add(temP);
		}
		if (theaB == true) {
			ImageView theaP = new ImageView(thea);
			theaP.relocate(510, 460);
			canv.getChildren().add(theaP);
		}
		if (labB == true) {
			ImageView labP = new ImageView(lab);
			labP.relocate(930, 510);
			canv.getChildren().add(labP);
		}
		if (barrB == true) {
			ImageView barrP = new ImageView(barr);
			barrP.relocate(280, 580);
			canv.getChildren().add(barrP);
		}
		if (markB == true) {
			ImageView baP = new ImageView(ba);
			baP.relocate(680, 560);
			canv.getChildren().add(baP);
		}

		switch (str) {
		case "library":
			ImageView libP = new ImageView(lib);
			libP.relocate(20, 500);
			canv.getChildren().addAll(libP);
			libB = true;
			break;
		case "forest":
			ImageView foreP = new ImageView(fore);
			foreP.relocate(250, 420);
			canv.getChildren().add(foreP);
			forestB = true;
			break;
		case "farm":
			ImageView farP = new ImageView(far);
			farP.relocate(800, 400);
			canv.getChildren().add(farP);
			farmB = true;
			break;
		case "mine":
			ImageView mineP1 = new ImageView(min);
			mineP1.relocate(50, 400);
			canv.getChildren().add(mineP1);
			mineB = true;
			break;
		case "temple":
			ImageView temP = new ImageView(tem);
			temP.relocate(540, 310);
			canv.getChildren().add(temP);
			tempB = true;
			break;
		case "theatre":
			ImageView theaP = new ImageView(thea);
			theaP.relocate(510, 460);
			canv.getChildren().add(theaP);
			theaB = true;
			break;
		case "laboratory":
			ImageView labP = new ImageView(lab);
			labP.relocate(930, 510);
			canv.getChildren().add(labP);
			labB = true;
			break;
		case "barracks":
			ImageView barrP = new ImageView(barr);
			barrP.relocate(280, 580);
			canv.getChildren().add(barrP);
			barrB = true;
			break;
		case "market":
			ImageView baP = new ImageView(ba);
			baP.relocate(680, 560);
			canv.getChildren().add(baP);
			markB = true;
			break;
		default:
			break;
		}

		if (cesarf == true) {
			ImageView mainIcon = new ImageView(cesar2);
			mainIcon.relocate(1255, 15);
			canv.getChildren().addAll(mainIcon);
		}
		if (kleopatraf == true) {
			ImageView mainIcon = new ImageView(kleopatra2);
			mainIcon.relocate(1255, 15);
			canv.getChildren().addAll(mainIcon);
		}
		if (alexf == true) {
			ImageView mainIcon = new ImageView(alex2);
			mainIcon.relocate(1255, 15);
			canv.getChildren().addAll(mainIcon);
		}
		if (ahilf == true) {
			ImageView mainIcon = new ImageView(ahil2);
			mainIcon.relocate(1255, 15);
			canv.getChildren().addAll(mainIcon);
		}

		Label happyL = new Label();
		Label goldKo = new Label();
		Label cultureKo = new Label();
		Label religionKo = new Label();
		Label scienceKo = new Label();
		Label goldKoT = new Label("GOLD");
		Label cultureKoT = new Label("CULTURE");
		Label religionKoT = new Label("RELIGION");
		Label scienceKoT = new Label("SCIENCE");
		happyness = new Happyness(scr);
		happyL.setGraphic(new ImageView(happyness.statusHappy(happyness.motionHappy(goldP, cultP, relP, scienP))));
		happyL.relocate(1270, 820);
		golde.setText(String.valueOf(goldP));
		culturee.setText(String.valueOf(cultP));
		religione.setText(String.valueOf(relP));
		sciencee.setText(String.valueOf(scienP));
		goldKo.setText(String.valueOf("+" + goldK));
		cultureKo.setText(String.valueOf("+" + cultK));
		religionKo.setText(String.valueOf("+" + relK));
		scienceKo.setText(String.valueOf("+" + scieK));
		golde.setId("numbers");
		culturee.setId("numbers");
		religione.setId("numbers");
		sciencee.setId("numbers");
		canv.setId("gridplay");
		armyb.relocate(1220, 200);
		armyb.setId("buttonsPlay");
		scienceb.relocate(1220, 400);
		scienceb.setId("buttonsPlay");
		buildb.relocate(1220, 600);
		buildb.setId("buttonsPlay");

		golde.relocate(100, 790);
		culturee.relocate(400, 790);
		religione.relocate(700, 790);
		sciencee.relocate(1000, 790);

		goldKo.relocate(100, 770);
		cultureKo.relocate(400, 770);
		religionKo.relocate(700, 770);
		scienceKo.relocate(1000, 770);

		goldKoT.relocate(120, 790);
		cultureKoT.relocate(400, 790);
		religionKoT.relocate(700, 790);
		scienceKoT.relocate(1000, 790);

		goldKo.setId("numbers");
		cultureKo.setId("numbers");
		religionKo.setId("numbers");
		scienceKo.setId("numbers");
		goldKoT.setId("labelK");
		cultureKoT.setId("labelK");
		religionKoT.setId("labelK");
		scienceKoT.setId("labelK");

		canv.getChildren().addAll(armyb, scienceb, golde, culturee, religione, sciencee, goldKo, cultureKo, religionKo,
				scienceKo, goldKoT, cultureKoT, religionKoT, scienceKoT, happyL, buildb);
		primaryStage.setFullScreen(true);
		initListeners();
		sceneplay.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return sceneplay;
	}

	public Scene getSceneScience() {
		Label agr = new Label("Земледелие. 700 GOLD. +3 money");
		Label minn = new Label("Шахты. 1000 GOLD. +5 money");
		Label wri = new Label("Письменность. 700 CULT. +3 culture");
		Label arch = new Label("Стрельба. 1200 GOLD. +6 money");
		Label cur = new Label("Деньги. 2500 GOLD. +8 money");
		Label dra = new Label("Драма. 1000 CULT. +5 culture");
		Label phil = new Label("Философия. 2000 CULT. +10 culture");
		Label guil = new Label("Гильдии. 2000 GOLD. +15 money");
		Label eng = new Label("Инжиниринг. 2000 SCIEN. +10 science");
		agr.setId("labels");
		minn.setId("labels");
		wri.setId("labels");
		arch.setId("labels");
		cur.setId("labels");
		dra.setId("labels");
		phil.setId("labels");
		guil.setId("labels");
		eng.setId("labels");
		agr.relocate(50, 240);
		minn.relocate(50, 490);
		wri.relocate(50, 750);
		arch.relocate(550, 240);
		cur.relocate(550, 490);
		dra.relocate(550, 750);
		phil.relocate(1050, 240);
		guil.relocate(1050, 490);
		eng.relocate(1050, 750);

		Pane canvas = new Pane();
		canvas.setId("buttonsPlay");
		agriculture.relocate(50, 50);
		agriculture.setId("buttonsSc");
		mining.relocate(50, 300);
		mining.setId("buttonsSc");
		writing.relocate(50, 550);
		writing.setId("buttonsSc");
		archery.relocate(550, 50);
		archery.setId("buttonsSc");
		currency.relocate(550, 300);
		currency.setId("buttonsSc");
		drama.relocate(550, 550);
		drama.setId("buttonsSc");
		philosophy.relocate(1050, 50);
		philosophy.setId("buttonsSc");
		guild.relocate(1050, 300);
		guild.setId("buttonsSc");
		engineering.relocate(1050, 550);
		engineering.setId("buttonsSc");
		backtoPlayMenu.relocate(550, 750);
		backtoPlayMenu.setId("buttonsW");
		canvas.getChildren().addAll(agriculture, mining, writing, archery, currency, drama, philosophy, guild,
				engineering, backtoPlayMenu, agr, minn, wri, arch, cur, dra, phil, guil, eng);
		Scene scene = new Scene(canvas, 1440, 900);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return scene;
	}

	public Scene getSceneBuildings() {
		Label l = new Label("Библиотека 500 GOLD. +3 science");
		Label fo = new Label("Пилорама 500 GOLD. +2 money");
		Label fa = new Label("Ферма 500 GOLD. +3 money");
		Label mi = new Label("Шахта 800 GOLD. +5 money");
		Label te = new Label("Храм 1000 GOLD. +5 religion");
		Label th = new Label("Театр 1000 GOLD. +5 culture");
		Label lab = new Label("Лаборатория 1500 GOLD. +10 science");
		Label ba = new Label("Казарма 800 GOLD. +5 science");
		Label ma = new Label("Рынок 2500 GOLD. +10 money");
		l.setId("labels");
		fo.setId("labels");
		fa.setId("labels");
		mi.setId("labels");
		te.setId("labels");
		th.setId("labels");
		lab.setId("labels");
		ba.setId("labels");
		ma.setId("labels");

		backtoPlayMenu.setId("buttonsW");
		Pane canvas = new Pane();
		canvas.setId("buttonsPlay");
		backtoPlayMenu.relocate(600, 750);
		library.relocate(10, 10);
		forest.relocate(510, 10);
		farm.relocate(1010, 10);
		mine.relocate(10, 270);
		temple.relocate(510, 230);
		theatre.relocate(1010, 250);
		laboratory.relocate(10, 510);
		baracks.relocate(510, 530);
		market.relocate(1010, 510);

		library.setId("buttonsW");
		forest.setId("buttonsW");
		farm.setId("buttonsW");
		mine.setId("buttonsW");
		temple.setId("buttonsW");
		theatre.setId("buttonsW");
		laboratory.setId("buttonsW");
		baracks.setId("buttonsW");
		market.setId("buttonsW");

		l.relocate(110, 245);
		fo.relocate(610, 190);
		fa.relocate(1110, 200);
		mi.relocate(110, 440);
		te.relocate(610, 490);
		th.relocate(1110, 470);
		lab.relocate(110, 720);
		ba.relocate(610, 750);
		ma.relocate(1110, 750);

		canvas.getChildren().addAll(library, forest, farm, mine, temple, theatre, laboratory, baracks, market, l, fo,
				fa, mi, te, th, lab, ba, ma, backtoPlayMenu);
		Scene scene = new Scene(canvas, 1440, 900);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return scene;
	}

	public Scene getSceneArmy() {

		Label ls = new Label("Воин сила 3, ловкость 1, интеллект 1 цена 100 GOLD");
		Label lb = new Label("Лучник сила 2, ловкость 2, интеллект 2 цена 200 GOLD");
		Label lm = new Label("Маг сила 1, ловкость 3, интеллект 3 цена 300 GOLD");

		Pane canvas = new Pane();
		canvas.setId("buttonsPlay");
		sword.setId("buttonsW");
		bow.setId("buttonsW");
		magik.setId("buttonsW");
		backtoPlayMenu.relocate(1150, 750);
		backtoPlayMenu.setId("buttonWar");
		war.relocate(630, 750);
		war.setId("buttonWar");

		sk.setText(String.valueOf(soldier));
		ak.setText(String.valueOf(archer));
		mk.setText(String.valueOf(wizz));

		sword.relocate(50, 100);
		bow.relocate(50, 370);
		magik.relocate(50, 640);

		ls.relocate(300, 150);
		lb.relocate(300, 400);
		lm.relocate(300, 650);

		ls.setId("labelsW");
		lb.setId("labelsW");
		lm.setId("labelsW");

		sk.relocate(1000, 150);
		ak.relocate(1000, 400);
		mk.relocate(1000, 650);

		sk.setId("labelsW");
		ak.setId("labelsW");
		mk.setId("labelsW");

		canvas.getChildren().addAll(sword, bow, magik, ls, lb, lm, sk, ak, mk, backtoPlayMenu, war);
		Scene scene = new Scene(canvas, 1440, 900);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return scene;

	}

	public Scene getSceneStart1() {
		threadb = true;
		enemyScore = 0;
		playerScore = 0;
		Pane grid = new Pane();
		Label l1 = new Label();
		Label l2 = new Label();
		Label l3 = new Label();
		Label l4 = new Label();

		l1.setText("Юлий Цезарь");
		l2.setText("Клеопатра");
		l3.setText("Александр");
		l4.setText("Ахилл");

		l1.relocate(800, 470);
		l2.relocate(400, 470);
		l3.relocate(400, 125);
		l4.relocate(800, 125);

		l1.setId("name");
		l2.setId("name");
		l3.setId("name");
		l4.setId("name");

		alexb.relocate(400, 180);
		ahilb.relocate(800, 180);
		kleopatrab.relocate(400, 520);
		cesarb.relocate(800, 520);

		alexb.setId("buttons");
		ahilb.setId("buttons");
		kleopatrab.setId("buttons");
		cesarb.setId("buttons");

		backtoMainMenu.setId("buttonsW");
		backtoMainMenu.relocate(50, 600);

		grid.setId("gridHeroList");
		grid.setPadding(new Insets(40, 40, 40, 40));
		Scene scene = new Scene(grid, 1440, 900);

		grid.getChildren().addAll(backtoMainMenu, alexb, ahilb, kleopatrab, cesarb, l1, l2, l3, l4);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return scene;
	}

	public Scene getSceneHowtoplay() throws IOException {

		Pane grid = new Pane();
		grid.setId("gridScore");
		Label i2 = new Label();
		reader = new Reader();
		i2.setText(reader.read("src/main/resources/Resources/Howtoplay.txt"));
		i2.relocate(450, 100);
		i2.setId("name");
		backtoMainMenu.setId("buttonsW");
		backtoMainMenu.relocate(550, 650);
		grid.getChildren().addAll(backtoMainMenu, i2);
		Scene scene = new Scene(grid, 1440, 900);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return scene;
	}

	public Scene getSceneScore(int playerScore, int enemyScore, String string) {
		Label yourscore = new Label(string);
		Pane grid = new Pane();
		Label EnemyScore = new Label("Enemy Score:  ");
		Label PlayerScore = new Label("Your Score:  ");
		Label setEnemyScore = new Label();
		Label setPlayerScore = new Label();
		setEnemyScore.relocate(500, 450);
		setPlayerScore.relocate(500, 250);
		EnemyScore.relocate(300, 450);
		PlayerScore.relocate(300, 250);
		yourscore.relocate(500, 50);
		setEnemyScore.setId("labelScr");
		setPlayerScore.setId("labelScr");
		EnemyScore.setId("labelScr");
		PlayerScore.setId("labelScr");
		yourscore.setId("labelFinal");
		setEnemyScore.setText(String.valueOf(enemyScore));
		setPlayerScore.setText(String.valueOf(playerScore));
		grid.getChildren().addAll(setEnemyScore, setPlayerScore, backtoMainMenu, yourscore, EnemyScore, PlayerScore);
		grid.setId("gridScore");
		backtoMainMenu.setId("buttonsW");
		backtoMainMenu.relocate(550, 650);
		Scene scene = new Scene(grid, 1440, 900);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return scene;
	}

	public Scene getSceneVideo() {
		Group root = new Group();
		reader = new Reader();
		Scene scene = new Scene(root, 1440, 900);
		root.getChildren().add(reader.playVideo("src/main/resources/Resources/fight.mp4"));
		return scene;
	}

	public Scene getSceneAlex() throws IOException {
		Pane canvas = new Pane();
		reader = new Reader();
		Label i2 = new Label();
		i2.setText(reader.read("src/main/resources/Resources/Alex.txt"));
		i2.relocate(770, 170);
		i2.setMaxSize(500, 600);
		ImageView i1 = new ImageView(alex);
		backtoMenu.setId("buttonsW");
		alexp.setId("buttonsW");
		canvas.setId("gridHero");
		i1.relocate(50, 200);
		l.relocate(50, 140);
		l.setText("Александр Македонский");
		l.setId("name");
		backtoMenu.relocate(710, 650);
		alexp.relocate(1080, 650);
		i1.setId("labelStory");
		i2.setId("labelStory");
		canvas.getChildren().addAll(i1, i2, l, backtoMenu, alexp);
		Scene scene = new Scene(canvas, 1440, 900);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return scene;
	}

	public Scene getSceneAhil() throws IOException {
		Pane canvas = new Pane();
		reader = new Reader();
		Label i2 = new Label();
		i2.setText(reader.read("src/main/resources/Resources/Ahil.txt"));
		i2.relocate(770, 170);
		i2.setMaxSize(500, 600);
		ImageView i1 = new ImageView(ahil);
		backtoMenu.setId("buttonsW");
		ahilp.setId("buttonsW");
		canvas.setId("gridHero");
		i1.relocate(50, 210);
		l.relocate(50, 140);
		l.setText("Ахилес");
		l.setId("name");
		backtoMenu.relocate(710, 650);
		ahilp.relocate(1080, 650);
		i1.setId("labelStory");
		i2.setId("labelStory");
		canvas.getChildren().addAll(i1, l, i2, backtoMenu, ahilp);
		Scene scene = new Scene(canvas, 1440, 900);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return scene;
	}

	public Scene getSceneKleopatra() throws IOException {
		Pane canvas = new Pane();
		reader = new Reader();
		Label i2 = new Label();
		i2.setText(reader.read("src/main/resources/Resources/Kleopatra.txt"));
		ImageView i1 = new ImageView(kleopatra);
		backtoMenu.setId("buttonsW");
		kleopatrap.setId("buttonsW");
		canvas.setId("gridHero");
		i2.relocate(770, 170);
		i2.setMaxSize(500, 600);
		i1.relocate(50, 210);
		l.relocate(50, 140);
		l.setText("Клеопатра");
		l.setId("name");
		backtoMenu.relocate(710, 650);
		kleopatrap.relocate(1080, 650);
		i1.setId("labelStory");
		i2.setId("labelStory");
		canvas.getChildren().addAll(i1, l, i2, backtoMenu, kleopatrap);
		Scene scene = new Scene(canvas, 1440, 900);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return scene;
	}

	public Scene getSceneCesar() throws IOException {
		Pane canvas = new Pane();
		reader = new Reader();
		Label i2 = new Label();
		i2.setText(reader.read("src/main/resources/Resources/Cesar.txt"));
		i2.relocate(770, 170);
		i2.setMaxSize(500, 600);
		ImageView i1 = new ImageView(cesar);
		backtoMenu.setId("buttonsW");
		cesarp.setId("buttonsW");
		canvas.setId("gridHero");
		i1.relocate(50, 210);
		l.relocate(50, 140);
		l.setText("Юлий Цезарь");
		l.setId("name");
		backtoMenu.relocate(710, 650);
		cesarp.relocate(1080, 650);
		i1.setId("labelStory");
		i2.setId("labelStory");
		canvas.getChildren().addAll(i1, l, i2, backtoMenu, cesarp);
		Scene scene = new Scene(canvas, 1440, 900);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		return scene;
	}

	private void initListeners() {
		start1.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				primaryStage.setScene(getSceneStart1());
				primaryStage.show();
			}
		});
		howtoplay.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {

				try {
					primaryStage.setScene(getSceneHowtoplay());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				primaryStage.show();
			}

		});
		options.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {

				primaryStage.setScene(getSceneScore(0, 0, ""));
				primaryStage.show();
			}
		});
		quit.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				primaryStage.close();
			}
		});
		ahilb.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {

				try {
					primaryStage.setScene(getSceneAhil());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				primaryStage.show();
			}
		});
		alexb.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {

				try {
					primaryStage.setScene(getSceneAlex());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				primaryStage.show();
			}
		});
		cesarb.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {

				try {
					primaryStage.setScene(getSceneCesar());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				primaryStage.show();
			}
		});
		kleopatrab.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {

				try {
					primaryStage.setScene(getSceneKleopatra());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				primaryStage.show();
			}
		});
		backtoMenu.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {

				primaryStage.setScene(getSceneStart1());
				primaryStage.show();
			}
		});
		backtoMainMenu.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {

				primaryStage.setScene(getScene());
				primaryStage.show();
			}
		});
		backtoPlayMenu.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {

				primaryStage.setScene(getScenePlay(""));
				primaryStage.show();
			}
		});
		ahilp.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				ahilf = true;
				relK += 3;
				goldK += 2;
				primaryStage.setScene(getScenePlay(""));
				primaryStage.show();
			}
		});
		alexp.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				alexf = true;
				relK += 2;
				cultK += 3;
				primaryStage.setScene(getScenePlay(""));
				primaryStage.show();
			}
		});
		kleopatrap.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				kleopatraf = true;
				cultK += 3;
				goldK += 2;
				primaryStage.setScene(getScenePlay(""));
				primaryStage.show();
			}
		});
		cesarp.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				cesarf = true;
				scieK += 2;
				goldK += 3;
				primaryStage.setScene(getScenePlay(""));
				primaryStage.show();
			}
		});
		armyb.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {

				primaryStage.setScene(getSceneArmy());
				primaryStage.show();
			}
		});
		scienceb.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {

				primaryStage.setScene(getSceneScience());
				primaryStage.show();
			}
		});
		buildb.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {

				primaryStage.setScene(getSceneBuildings());
				primaryStage.show();
			}
		});
		library.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 500 && libB == false) {
					goldP -= 500;
					scieK += 3;
					primaryStage.setScene(getScenePlay("library"));
					primaryStage.show();
				}
			}
		});
		forest.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 500 && forestB == false) {
					goldP -= 500;
					goldK += 2;
					primaryStage.setScene(getScenePlay("forest"));
					primaryStage.show();
				}
			}
		});
		farm.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 500 && farmB == false) {
					goldP -= 500;
					goldK += 3;
					primaryStage.setScene(getScenePlay("farm"));
					primaryStage.show();
				}
			}
		});
		mine.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 800 && mineB == false) {
					goldP -= 800;
					goldK += 5;
					primaryStage.setScene(getScenePlay("mine"));
					primaryStage.show();
				}
			}
		});
		temple.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 1000 && tempB == false) {
					goldP -= 1000;
					relK += 5;
					primaryStage.setScene(getScenePlay("temple"));
					primaryStage.show();
				}
			}
		});
		theatre.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 1000 && theaB == false) {
					goldP -= 1000;
					cultK += 5;
					primaryStage.setScene(getScenePlay("theatre"));
					primaryStage.show();
				}
			}
		});
		laboratory.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 1500 && labB == false) {
					goldP -= 1500;
					scieK += 10;
					primaryStage.setScene(getScenePlay("laboratory"));
					primaryStage.show();
				}
			}
		});
		baracks.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 800 && barrB == false) {
					goldP -= 800;
					scieK += 5;
					primaryStage.setScene(getScenePlay("barracks"));
					primaryStage.show();
				}
			}
		});
		market.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 2500 && markB == false) {
					goldP -= 2500;
					goldK += 10;
					primaryStage.setScene(getScenePlay("market"));
					primaryStage.show();
				}
			}
		});
		agriculture.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 700 && agrB == false) {
					agrB = true;
					goldK += 3;
				}
			}
		});
		mining.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 1000 && minB == false) {
					minB = true;
					goldK += 5;
				}
			}
		});
		writing.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (cultP >= 700 && wriB == false) {
					wriB = true;
					cultK += 3;
				}
			}
		});
		archery.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 1200 && archB == false) {
					archB = true;
					goldK += 6;
				}
			}
		});
		currency.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 2500 && curB == false) {
					curB = true;
					goldK += 8;
				}
			}
		});
		drama.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (cultP >= 1000 && draB == false) {
					draB = true;
					cultK += 5;
				}
			}
		});
		philosophy.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (cultP >= 2000 && philB == false) {
					philB = true;
					cultK += 10;
				}
			}
		});
		guild.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 2000 && guilB == false) {
					guilB = true;
					goldK += 15;
				}
			}
		});
		engineering.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (scienP >= 2000 && engB == false) {
					engB = true;
					scieK += 10;
				}
			}
		});
		sword.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 100) {
					soldier += 1;
					goldP -= 100;
				}

			}
		});
		bow.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 200) {
					archer += 1;
					goldP -= 200;
				}
			}
		});
		magik.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				if (goldP >= 300) {
					wizz += 1;
					goldP -= 300;
				}
			}
		});
		war.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent e) {
				threadb = false;
				libB = false;
				farmB = false;
				forestB = false;
				mineB = false;
				theaB = false;
				tempB = false;
				markB = false;
				barrB = false;
				labB = false;
				agrB = false;
				minB = false;
				wriB = false;
				archB = false;
				curB = false;
				draB = false;
				philB = false;
				guilB = false;
				engB = false;
				ahilf = false;
				alexf = false;
				kleopatraf = false;
				cesarf = false;

				System.out.println("Video starts.");
				Warrior warrior = new Warrior();
				Player player = new Player(scr);
				Soldier sol = new Soldier();
				Archer arch = new Archer();
				Wizard wiz = new Wizard();

				playerScore = player.CalculateScore(goldP, goldK, cultP, cultK, scienP, scieK, relP, relK)
						+ sol.warriorStrength() * soldier + arch.warriorStrength() * archer
						+ wiz.warriorStrength() * wizz;

				String result = warrior.fight(playerScore, enemyScore);
				System.out.println("Счет врага " + enemyScore);
				System.out.println("Ваш счет " + playerScore);
				if (result == "VICTORY") {
					System.out.println("VICTORY");
					goldP = 500;
					cultP = 100;
					relP = 100;
					scienP = 100;
					goldK = 1;
					cultK = 1;
					relK = 1;
					scieK = 1;
					soldier = 0;
					archer = 0;
					wizz = 0;
					primaryStage.setScene(getSceneScore(playerScore, enemyScore, "VICTORY"));
					primaryStage.show();
				}
				if (result == "YOU LOST") {
					System.out.println("YOU LOST");
					goldP = 500;
					cultP = 100;
					relP = 100;
					scienP = 100;
					goldK = 1;
					cultK = 1;
					relK = 1;
					scieK = 1;
					soldier = 0;
					archer = 0;
					wizz = 0;
					primaryStage.setScene(getSceneScore(playerScore, enemyScore, "YOU LOST"));
					primaryStage.show();

				}
				;

			}
		});
	}

	public static int getGoldP() {
		return goldP;
	}

	public static void setGoldP(int goldP) {
		Play.goldP = goldP;
	}

	public static int getCultP() {
		return cultP;
	}

	public static void setCultP(int cultP) {
		Play.cultP = cultP;
	}

	public static int getRelP() {
		return relP;
	}

	public static void setRelP(int relP) {
		Play.relP = relP;
	}

	public static int getScienP() {
		return scienP;
	}

	public static void setScienP(int scienP) {
		Play.scienP = scienP;
	}

	public static int getGoldK() {
		return goldK;
	}

	public static void setGoldK(int goldK) {
		Play.goldK = goldK;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
