package page;

/**
 * Created by linhtran on 16/07/17.
 */


public class PageService {

    //totalPage : tong so trang
    //page current: trang hien tai
    //pagenum: so trang view trong mot web page
    //numberlink la khoang dich chuyen giua trang dau voi trang hien tai, tran hien tai voi trang cuoi
    public static Page getPage(int totalPage, int pageCurrent, int pagNum) {
        Page page = new Page();

        int numLink = pagNum/2;
        if (pageCurrent >= pagNum) {
            page.start = pageCurrent - numLink;
            if (totalPage > pageCurrent + numLink) {
                page.end = pageCurrent + numLink;
            } else if (pageCurrent <= totalPage && pageCurrent > totalPage - (pagNum - 1)) {
                page.start = totalPage - (pagNum - 1);
                page.end = totalPage;
            } else {
                page.end = totalPage;
            }
        } else {
            page.start = 1;
            if (totalPage > pagNum)
                page.end = pagNum;
            else
                page.end = totalPage;
        }
        return  page;
    }
}
