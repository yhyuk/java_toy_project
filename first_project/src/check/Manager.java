package yanolja;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import yanolja.HotelDTO;
import yanolja.ManagerMain;
import yanolja.print;


public class Manager {

	String leftBlank="                                 ";
	String upBlank="\n\n\n\n\n\n\n\n\n\n";
	String menuBlank="                 ";
	String insertBlank = leftBlank + menuBlank + "                              Ⅰ";
	String msgBlank = leftBlank + menuBlank + "                           Ⅱ";
	ManagerDAO dao = new ManagerDAO();
	Scanner sc = new Scanner(System.in);
	print pt = new print();
	int ch; // 菴煎陛晦 摹鷗嫡擊 陽 嫡朝 滲熱

	public void printSc() { // 婦葬濠 - ��蘿 褻�� 蛤蝶Ы溯檜

		int ch;

		try {
			while (true) {
				System.out.println(leftBlank+menuBlank+"﹥-收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收-旬");
				System.out.println(leftBlank+menuBlank+"早    ��蘿ID 早  ��蘿檜葷  早蛔晝早   渠ル濠   早    措陛    早    紫衛   早 ");
				System.out.println(leftBlank+menuBlank+"曲-收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收-旭");
				hotelPrint();
				System.out.println(leftBlank+menuBlank+" 收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
				System.out.print(pt.printsr());
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					return;
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void hotelPrint() { // 瞪羹 ��蘿 褻��

		List<HotelDTO> lists = dao.hotelPrint();

		Iterator<HotelDTO> it = lists.iterator();

		while (it.hasNext()) {

			HotelDTO hdto = it.next();
			System.out.println(hdto.toStringG());

		}

	}

	public void hotelInsert() { // 婦葬濠 - ��蘿 蹺陛

		try {

			HotelDTO hdto = new HotelDTO();

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒��蘿囀萄 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setHotelCode(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒��蘿檜葷 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setHotelName(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒��蘿蛔晝 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setHotelClass(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒螃傘檜葷 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setOwner(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒п渡措陛 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setCountry(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒п渡雖羲 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setCity(sc.next());

			dao.hotelInsert(hdto);


		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void hotelUpdate() { // 婦葬濠 - ��蘿 熱薑

		try {

			HotelDTO hdto = new HotelDTO();

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒��蘿囀萄 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setHotelCode(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒熱)��蘿檜葷 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setHotelName(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒熱)��蘿蛔晝 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setHotelClass(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒熱)螃傘檜葷 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setOwner(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒熱)п渡措陛 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setCountry(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒熱)п渡雖羲 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setCity(sc.next());

			dao.hotelUpdate(hdto);


		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void hotelDelete() { // 婦葬濠 - ��蘿 餉薯

		try {

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒��蘿囀萄 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			String hotelcode = sc.next();

			dao.hotelDelete(hotelcode);


		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	//-------------��蘿瑛 婦葬-------------------------

	public void roomPrint() { // 瞪羹 ��蘿寞 爾晦

		List<HotelDTO> lists = dao.roomPrint();

		Iterator<HotelDTO> it = lists.iterator();

		while (it.hasNext()) {

			HotelDTO hdto = it.next();

			System.out.println(hdto.toStringG());

		}

	}

	public void printRom() { // 婦葬濠 - ��蘿寞 褻�� 蛤蝶Ы溯檜
		int ch;

		try {

			while (true) {

				do {
					System.out.println();
					System.out.println(leftBlank+menuBlank+menuBlank+"          ﹥-收收收收收收收收收收-旬");
					System.out.println(leftBlank+menuBlank+menuBlank+"          早  ��蘿ID  早  寞 檜葷 早");
					System.out.println(leftBlank+menuBlank+menuBlank+"          曲-收收收收收收收收收收-旭");
					roomPrint_ver2();
					// System.out.println(leftBlank+menuBlank+menuBlank+"          曲收收收收收收收收收收收旭");
					System.out.print(pt.printsr());
					ch = sc.nextInt();

				} while (ch < 1 || ch > 1);

				switch (ch) {

				case 1:
					return; // 菴煎
				}

			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void roomPrint_ver2() { // 瞪羹 ��蘿寞 褻��

		List<HotelDTO> lists = dao.roomPrint();

		Iterator<HotelDTO> it = lists.iterator();

		while (it.hasNext()) {

			HotelDTO hdto = it.next();

			System.out.println(hdto.toStringR());

		}

	}

	public void roomInsert() { // ��蘿 寞 蹺陛

		try {

			HotelDTO hdto = new HotelDTO();

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒��蘿囀萄 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setHotelCode(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒寞檜葷 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setRoomName(sc.next());

			dao.roomInsert(hdto);


		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void roomUpdate() { // ��蘿 寞 熱薑

		try {

			HotelDTO hdto = new HotelDTO();

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒��蘿囀萄 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setHotelCode(sc.next());

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒熱) 寞檜葷 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setRoomName(sc.next());

			dao.roomUpdate(hdto);


		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void roomDelete() { // ��蘿 寞 餉薯

		try {

			HotelDTO hdto = new HotelDTO();

			System.out.print(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒��蘿囀萄 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setHotelCode(sc.next());

			System.out.println(upBlank+upBlank+upBlank+leftBlank+menuBlank+"≒餉薯й 寞檜葷 殮溘ж撮蹂 "+upBlank+upBlank+upBlank+upBlank);
			hdto.setRoomName(sc.next());


			dao.roomDelete(hdto);


		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	//-----------------------------------------------------	

	ManagerDAO mdao = new ManagerDAO(); // ManagerDAO 偌羹 儅撩

	//-----------------婦葬濠 蕨擒婦葬---------------------

	public void viewAllHistory() { // 瞪羹 餌辨濠 蕨擒頂羲 爾晦

		try {
			List<UserHistoryDTO> lists = mdao.getHistoryList();
			Iterator<UserHistoryDTO> it = lists.iterator();
			System.out.print(leftBlank+"               收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收\n");
			System.out.printf(leftBlank+"               %10s早%10s早%20s早%20s早%10s","USERID","HOTELCODE","CHECKIN","CHECKOUT","TOTALEXP");
			System.out.print("\n"+leftBlank+"               收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收\n");
			if(it.hasNext()!=false) {
				while(it.hasNext()) {
					UserHistoryDTO hdto = it.next();
					System.out.printf(leftBlank+"               %10s早%10s早%20s早%20s早%10s",hdto.getUserId(),hdto.getHotelCode(),hdto.getCheckIn(),hdto.getCheckOut(),hdto.getTotalExp());
					System.out.println();
				}
				do {
					System.out.print(pt.printsr());
					ch = sc.nextInt();
					switch (ch) {
					case 1: return;
					}
				}while(ch<1||ch>1);
			}else {
				System.out.println(msgBlank+"褻�葭Ж� 蕨擒 頂羲檜 橈蝗棲棻.");
				do {
					System.out.print(pt.printsr());
					ch = sc.nextInt();
					switch (ch) {
					case 1: return;
					}
				}while(ch<1||ch>1);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void searchHistory() { // 嬴檜蛤煎 �蛾衋� 蕨擒頂羲 匐儀

		try {
			UserHistoryDTO hdto = null;
			boolean check = false; // �蛾� 氈朝雖 �挫怷� 滲熱
			System.out.print(leftBlank+"               收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收\n");
			System.out.printf(leftBlank+"               %10s早%10s早%20s早%20s早%10s","USERID","HOTELCODE","CHECKIN","CHECKOUT","TOTALEXP");
			System.out.print("\n"+leftBlank+"               收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收\n");
			do { // 氈朝 嬴檜蛤檣雖 羹觼 橈戲賊 霞ч X
				System.out.print(insertBlank+"匐儀й �蛾醼D: ");
				String id = sc.next();
				if(mdao.dbidCheck(id)==false) {
					System.out.println(msgBlank+"蛔煙腎雖 彊擎 嬴檜蛤殮棲棻.");
					do {
						System.out.print(pt.printsr());
						ch = sc.nextInt();
						switch (ch) {
						case 1: return;
						}
					}while(ch<1||ch>1);
					check = false;
				}else {
					hdto = new UserHistoryDTO();
					hdto = mdao.getHistory(id);
					System.out.printf(leftBlank+"               %10s早%10s早%20s早%20s早%10s",hdto.getUserId(),hdto.getHotelCode(),hdto.getCheckIn(),hdto.getCheckOut(),hdto.getTotalExp());
					System.out.println();
					do {
						System.out.print(pt.printsr());
						ch = sc.nextInt();
						switch (ch) {
						case 1: return;
						}
					}while(ch<1||ch>1);
					check = true;
					break;
				}
			}while(check);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void updateHistory() { // 蕨擒 薑爾 熱薑

		try {
			UserHistoryDTO hdto = null;
			boolean check = false;
			do {
				System.out.print(insertBlank+"熱薑й �蛾� ID: ");
				String id = sc.next();
				if(mdao.dbidCheck(id)==false) {
					System.out.println(msgBlank+"蛔煙腎雖 彊擎 嬴檜蛤殮棲棻.");
					do {
						System.out.print(pt.printsr());
						ch = sc.nextInt();
						switch (ch) {
						case 1: return;
						}
					}while(ch<1||ch>1);
					check = false;
				}else {
					hdto = new UserHistoryDTO();
					System.out.print(insertBlank+"熱薑й ��蘿檜葷: ");
					String hotelname = sc.next();
					System.out.print(insertBlank+"殮褒 陳瞼 熱薑(YYYY-MM-DD): ");
					hdto.setCheckIn(sc.next());
					System.out.print(insertBlank+"黴褒 陳瞼 熱薑(YYYY-MM-DD): ");
					hdto.setCheckOut(sc.next());
					if(mdao.updateHistoryData(id, hotelname)==true) {
						System.out.println(msgBlank+"熱薑 撩奢");
						boolean flag = false;
						do {
							System.out.print(leftBlank + menuBlank + "                           ﹥嬴鼠酈釭 殮溘ж撮蹂 ");
							String str = sc.next();
							if(str!=null) {
								flag = true;
								break;
							}else {
								flag = false;
							}
						}while(flag);
						check = true;
					}else {
						System.out.println(msgBlank+"熱薑 褒ぬ");
						do {
							System.out.print(pt.printsr());
							ch = sc.nextInt();
							switch (ch) {
							case 1: return;
							}
						}while(ch<1||ch>1);
						check = false;
					}
				}
			}while(check);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void deleteHistory() { // 蕨擒 鏃模

		try {
			boolean check = false; // 嬴檜蛤 羹觼辨 滲熱
			do {
				System.out.print(insertBlank+"蕨擒鏃模й �蛾� ID: ");
				String id = sc.next();
				if(mdao.dbidCheck(id)==false) {
					System.out.println(msgBlank+"蛔煙腎雖 彊擎 嬴檜蛤殮棲棻.");
					do {
						System.out.print(pt.printsr());
						ch = sc.nextInt();
						switch (ch) {
						case 1: return;
						}
					}while(ch<1||ch>1);
					check =false;
				}else {
					System.out.print(insertBlank+"蕨擒鏃模й ��蘿檜葷: ");
					String hotelcode = mdao.getHotelCode(sc.next()); // ��蘿檜葷 嫡嬴憮 ��蘿囀萄煎 奩�� �� ��蘿檜 氈朝雖 羹觼
					if(mdao.checkHotel(hotelcode)==false) {
						System.out.println(msgBlank+"��蘿檜葷檜 澀跤腑蝗棲棻."); 
						do {
							System.out.print(pt.printsr());
							ch = sc.nextInt();
							switch (ch) {
							case 1: return;
							}
						}while(ch<1||ch>1);
						break;
					}else {
						System.out.print(insertBlank+"殮褒蕨薑橾(YYYY-MM-DD): ");
						String checkin = sc.next();
						if(mdao.checkCheckIn(hotelcode, checkin)==false) {
							System.out.println(msgBlank+"п渡ж朝 蕨擒勒檜 橈蝗棲棻.");
							do {
								System.out.print(pt.printsr());
								ch = sc.nextInt();
								switch (ch) {
								case 1: return;
								}
							}while(ch<1||ch>1);
							break;
						}else {
							System.out.print(insertBlank+"黴褒蕨薑橾(YYYY-MM-DD): ");
							String checkout = sc.next();
							if(mdao.checkCheckOut(hotelcode, checkin, checkout)==false) {
								System.out.println(msgBlank+"п渡ж朝 蕨擒勒檜 橈蝗棲棻.");
								do {
									System.out.print(pt.printsr());
									ch = sc.nextInt();
									switch (ch) {
									case 1: return;
									}
								}while(ch<1||ch>1);
								break;
							}else {
								String a; // 殮溘嫡擎 高檜 y 傳朝 n檣雖 �挫恉炴� 滲熱
								do {
									System.out.print(insertBlank+"薑蜓 餉薯ж衛啊蝗棲梱? ");
									a = sc.next();
									if(a.equalsIgnoreCase("y")) {
										if(mdao.deleteHistoryData(id,hotelcode,checkin,checkout)==true) {
											System.out.println(msgBlank+"餉薯 撩奢");
											boolean flag = false;
											do {
												System.out.print(leftBlank + menuBlank + "                           ﹥嬴鼠酈釭 殮溘ж撮蹂 ");
												String str = sc.next();
												if(str!=null) {
													flag = true;
													break;
												}else {
													flag = false;
												}
											}while(flag);
											check = true;
											break;
										}else {
											System.out.println(msgBlank+"餉薯 褒ぬ");
											do {
												System.out.print(pt.printsr());
												ch = sc.nextInt();
												switch (ch) {
												case 1: return;
												}
											}while(ch<1||ch>1);
											check = true;
											break;
										}
									}else if(a.equalsIgnoreCase("n")){
										System.out.println(msgBlank+"餉薯蒂 鏃模ж艘蝗棲棻.");
										do {
											System.out.print(pt.printsr());
											ch = sc.nextInt();
											switch (ch) {
											case 1: return;
											}
										}while(ch<1||ch>1);
										break;						
									}else {
										System.out.println(msgBlank+"澀 跤 殮溘ж樟蝗棲棻.");					
									}
								}while(!a.equalsIgnoreCase("y")&&!a.equalsIgnoreCase("n"));
							}
						}
					}
				}
			}while(check);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	//------------------婦葬濠 �蛾灠�葬----------------------


	public void viewAllUsers() { // 瞪羹 �蛾� 爾晦

		try {
			List<UserDBDTO> lists = mdao.getUsersList();
			Iterator<UserDBDTO> it = lists.iterator();

			System.out.print("                      " + "收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收\n");
			System.out.printf("                      " + " %10s早%10s早%10s早%3s早%2s早%20s早%20s早%20s早%20s早%15s","ID","PWD","Name","AGE","SEX","COUNTRY","CITY","EMAIL","REGDATE","TEL");
			System.out.print("\n                      " + "收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收\n");

			if(it.hasNext()!=false) {
				while(it.hasNext()) {
					UserDBDTO dbdto = it.next();
					System.out.printf("                      " + " %10s早%10s早%10s早%3s早%3s早%20s早%20s早%20s早%20s早%15s",
							dbdto.getUserId(),dbdto.getPwd(),dbdto.getUserName(),dbdto.getAge(),dbdto.getSex(),dbdto.getCountry(),dbdto.getCity(),dbdto.getEmail(),dbdto.getRegDate(),dbdto.getTel());
					System.out.println();
				}
				int ch;
				do {
					System.out.println(pt.printsr());
					ch = sc.nextInt();
					switch(ch) {
					case 1: return;
					}
				}while(ch<1||ch>1);
			}else {
				System.out.println(msgBlank+"褻�葭Ж� �蛾� 薑爾陛 橈蝗棲棻.");
				do {
					System.out.print(pt.printsr());
					ch = sc.nextInt();
					switch (ch) {
					case 1: return;
					}
				}while(ch<1||ch>1);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void searchUser() { // 嬴檜蛤煎 �蛾� 薑爾 匐儀

		try {
			UserDBDTO dbdto = null;
			boolean check = false;

			System.out.print("                      " + "收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收\n");
			System.out.printf("                      " + " %10s早%10s早%10s早%3s早%2s早%20s早%20s早%20s早%20s早%15s","ID","PWD","Name","AGE","SEX","COUNTRY","CITY","EMAIL","REGDATE","TEL");
			System.out.print("\n                      " + "收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收\n");

			do {
				System.out.print(insertBlank+"匐儀й �蛾� ID: ");
				String id = sc.next();
				if(mdao.dbidCheck(id)==false) {
					System.out.println(msgBlank+"蛔煙腎雖 彊擎 嬴檜蛤殮棲棻.");
					do {
						System.out.print(pt.printsr());
						ch = sc.nextInt();
						switch (ch) {
						case 1: return;
						}
					}while(ch<1||ch>1);
					check = false;
				}else {
					dbdto = new UserDBDTO();
					dbdto = mdao.getUser(id);
					System.out.printf("                      " + " %10s早%10s早%10s早%3s早%3s早%20s早%20s早%20s早%20s早%15s",
							dbdto.getUserId(),dbdto.getPwd(),dbdto.getUserName(),dbdto.getAge(),dbdto.getSex(),dbdto.getCountry(),dbdto.getCity(),dbdto.getEmail(),dbdto.getRegDate(),dbdto.getTel());
					System.out.println();
					do {
						System.out.print(pt.printsr());
						ch = sc.nextInt();
						switch (ch) {
						case 1: return;
						}
					}while(ch<1||ch>1);
					check = true;
					break;
				}
			}while(check);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void updateUser() { // �蛾� 薑爾 熱薑

		try {
			UserDBDTO dbdto = null;
			boolean check = false;
			do {
				System.out.print(insertBlank+"熱薑й �蛾衋� ID: ");
				String id = sc.next();
				if(mdao.dbidCheck(id)==false) {
					System.out.println(msgBlank+"蛔煙腎雖 彊擎 嬴檜蛤殮棲棻.");
					do {
						System.out.print(pt.printsr());
						ch = sc.nextInt();
						switch (ch) {
						case 1: return;
						}
					}while(ch<1||ch>1);
					check = false;
				}else {
					dbdto = new UserDBDTO();
					dbdto.setUserId(id);
					System.out.print(insertBlank+"綠塵廓�� 滲唳: ");
					dbdto.setPwd(sc.next());
					System.out.print(insertBlank+"檜葷 滲唳: ");
					dbdto.setUserName(sc.next());;
					System.out.print(insertBlank+"釭檜 滲唳(璋濠): ");
					dbdto.setAge(sc.nextInt());
					System.out.print(insertBlank+"撩滌 滲唳(M/W): ");
					dbdto.setSex(sc.next());
					System.out.print(insertBlank+"措瞳 滲唳: ");
					dbdto.setCountry(sc.next());
					System.out.print(insertBlank+"紫衛 滲唳: ");
					dbdto.setCity(sc.next());
					System.out.print(insertBlank+"檜詭橾 滲唳: ");
					dbdto.setEmail(sc.next());
					System.out.print(insertBlank+"瞪�食醽� 滲唳: ");
					dbdto.setTel(sc.next());
					if(mdao.updateUserData(dbdto)==true) {
						System.out.println(msgBlank+"熱薑 撩奢");
						boolean flag = false;
						do {
							System.out.print(leftBlank + menuBlank + "                           ﹥嬴鼠酈釭 殮溘ж撮蹂 ");
							String str = sc.next();
							if(str!=null) {
								flag = true;
								break;
							}else {
								flag = false;
							}
						}while(flag);
						check = true;
						break;
					}else {
						System.out.println(msgBlank+"熱薑 褒ぬ");
						do {
							System.out.print(pt.printsr());
							ch = sc.nextInt();
							switch (ch) {
							case 1: return;
							}
						}while(ch<1||ch>1);
						check = false;
					}				
				}
			}while(check);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void deleteUser() { // �蛾� 薑爾 餉薯

		try {
			boolean check = false; // 嬴檜蛤 羹觼辨 滲熱
			do {
				System.out.print(insertBlank+"餉薯й �蛾衋� ID: ");
				String id = sc.next();
				if(mdao.dbidCheck(id)==false) {
					System.out.println(msgBlank+"蛔煙腎雖 彊擎 嬴檜蛤殮棲棻.");
					do {
						System.out.print(pt.printsr());
						ch = sc.nextInt();
						switch (ch) {
						case 1: return;
						}
					}while(ch<1||ch>1);
					check =false;
				}else {
					String a; // 殮溘嫡擎 高檜 y 傳朝 n檣雖 �挫恉炴� 滲熱
					do {
						System.out.print(insertBlank+"薑蜓 餉薯ж衛啊蝗棲梱? ");
						a = sc.next();
						if(a.equalsIgnoreCase("y")) {
							if(mdao.deleteUserData(id)==true) {
								System.out.println(msgBlank+"餉薯 撩奢");
								boolean flag = false;
								do {
									System.out.print(leftBlank + menuBlank + "                           ﹥嬴鼠酈釭 殮溘ж撮蹂 ");
									String str = sc.next();
									if(str!=null) {
										flag = true;
										break;
									}else {
										flag = false;
									}
								}while(flag);
								check = true;
							}else {
								System.out.println(msgBlank+"餉薯 褒ぬ");
								do {
									System.out.print(pt.printsr());
									ch = sc.nextInt();
									switch (ch) {
									case 1: return;
									}
								}while(ch<1||ch>1);
								check = true;
								break;
							}
						}else if(a.equalsIgnoreCase("n")){
							System.out.println(msgBlank+"餉薯蒂 鏃模ж艘蝗棲棻.");
							do {
								System.out.print(pt.printsr());
								ch = sc.nextInt();
								switch (ch) {
								case 1: return;
								}
							}while(ch<1||ch>1);
							break;
						}else {
							System.out.println(msgBlank+"澀 跤 殮溘ж樟蝗棲棻.");
						}
					}while(!a.equalsIgnoreCase("y")&&!a.equalsIgnoreCase("n"));
				}
			}while(check);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
