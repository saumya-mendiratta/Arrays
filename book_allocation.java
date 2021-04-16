package self_afterarray;

import java.util.Scanner;

public class book_allocation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
            
		int t=scn.nextInt();
		while(t-->0)
		{
		int nob=scn.nextInt();
		int nos=scn.nextInt();
//                int nob = 4;
//				int nos = 2;
				int[] books = new int[nob];
				for(int i=0;i<books.length;i++)
				{
					 books[i]=scn.nextInt();
				}

				int lo = books[books.length-1];
				int hi = 0;

				for (int b : books) {
					hi += b;
				}

				int ans = 0;

				while (lo <= hi) {

					int mid = (lo + hi) / 2;

					if (isItPossible(books, mid, nos)) {

						ans = mid;
						hi = mid - 1;
					} else {

						lo = mid + 1;
					}

				}

				System.out.println(ans);
		}

			}

			public static boolean isItPossible(int[] books, int cap, int nos) {

				int students = 1;
				int pagesRead = 0;

				int currBook = 0;

				while (currBook < books.length) {

					if (pagesRead + books[currBook] <= cap) {
						pagesRead += books[currBook];
						currBook++;
					} else {

						students++;
						pagesRead = 0;
					}

					if (students > nos) {
						return false;
					}
				}
				return true;
			}

		}