public class _01Alocate_books {
    /*
     * Given books where arr[i] is the number of pages in the ith book,
     * allocate books to m students in contiguous order.
     * Minimize the maximum pages assigned to any student.
     */

    public static void main(String[] args) {

        int[] books = {12, 34, 67, 90};
        int students = 2;

        System.out.println("Linear Answer: " + allocateBooksLinear(books, students));
        System.out.println("Binary Search Answer: " + allocateBooksBS(books, students));
    }

    /*
 * Why we use requiredStudents <= m instead of requiredStudents == m:
 *
 * Example:
 * books = {10, 10, 10, 10}, m = 3
 *
 * For maxPages = 10:
 * [10] [10] [10] [10]
 * requiredStudents = 4  -> not possible
 *
 * For maxPages = 20:
 * [10,10] [10,10]
 * requiredStudents = 2 < 3
 *
 * But maxPages = 20 is still valid because we can split further:
 * [10,10] [10] [10]
 *
 * Now exactly 3 students are used, each gets at least one book,
 * and no student exceeds 20 pages.
 *
 * Therefore:
 * requiredStudents > m  -> invalid
 * requiredStudents <= m -> valid
 */
    
    static int allocateBooksLinear(int[] books, int m) {

        int n = books.length;
        if (m > n) {
            return -1;
        }
        int low = findMax(books);
        int high = findSum(books);

        for (int pages = low; pages <= high; pages++) {
            int requiredStudents = countStudents(books, pages);
            if (requiredStudents <= m) {
                return pages;
            }
        }
        return -1;
    }

    static int allocateBooksBS(int[] books, int m){
        int n = books.length;
        if (m > n) {
            return -1;
        }

        int low = findMax(books);
        int high = findSum(books);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int requiredStudents = countStudents(books, mid);
            if (requiredStudents <= m) {       // mid works, try smaller maximum pages
                high = mid - 1;
            } else {// need too many students
                low = mid + 1;
            }
        }
        return low;
    }

    // COMMON HELPER Returns number of students required for a given maximum page limit
     static int countStudents(int[] books, int maxPages) {

        int students = 1;
        int pages = 0;

        for (int book : books) {
            if (pages + book <= maxPages) {
                pages += book;
            } else {
                students++;
                pages = book;
            }
        }
        return students;
    }


    // Find maximum book pages
    static int findMax(int[] books) {
        int max = Integer.MIN_VALUE;
        for (int book : books) {
            max = Math.max(max, book);
        }
        return max;
    }


    // Find total pages
    static int findSum(int[] books) {
        int sum = 0;
        for (int book : books) {
            sum += book;
        }
        return sum;
    }
}