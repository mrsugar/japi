# jAPI - Công cụ hỗ trợ sử dụng API [![Build Status](https://travis-ci.org/mrsugar/japi.svg?branch=master)](https://travis-ci.org/mrsugar/japi)

Hiện nay việc sử dụng API đã phổ biến hơn bao giờ hết, từ ứng dụng di động cho tới web-app. Vì vậy, việc có một công cụ hỗ trợ xây dựng, dò lỗi là vô cùng quan trọng. Ứng dụng trên nền Java jAPI được phát triển bởi [Anh Tuấn](https://www.facebook.com/mrsugarvn).

![Logo jAPI](http://i.imgur.com/1qrepNv.png)

## Các công cụ hỗ trợ
### Phần mềm
* Netbeans
* phpMyAdmin hoặc SQL Server Studio
### Các dịch vụ
* Máy chủ MySQL hoặc MSSQL
* [httpbin.org](http://httpbin.org) cho việc demo

### Cài đặt môi trường JRE
Vì là ứng dụng viết trên nền Java nên chúng ta cần cài đặt môi trường Java trước khi sử dụng. Bạn có thể tải về Java Runtime Enviroment (JRE8) [tại đây](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html) nếu chưa cài đặt.
### Tải về và khởi động jAPI
Sau khi cài đặt xong môi trường Java, chúng ta tiếp tục tải về ứng dụng **jAPI** để sử dụng. Bạn có thể tải về phiên bản [1.4](https://github.com/mrsugar/japi/blob/master/target/jAPI-1.4-jar-with-dependencies.jar) hoặc các phiên bản mới hơn [tại đây](https://github.com/mrsugar/japi/tree/master/target) (tải file có tên **-with-dependencies**)

Để khởi động bạn có thể làm theo cách thông thường là nhấp đúp vào tập tin .jar vừa tải về.

![Giao diện jAPI](http://i.imgur.com/PbhgsGW.png)

# Hướng dẫn sử dụng 

### Debug mode
Như tên gọi, ở chế độ này, chương trình sẽ hạn chế nhất việc thông báo lỗi và sẽ cố gắng hiển thị tất cả thông tin mà server trả về để người dùng có thể xác định lỗi. Ví dụ header trả về 404 sẽ cho người dùng biết đường dẫn URL này không tồn tại, 403 là đường dẫn bị giới hạn.

Một số mã lỗi thông dụng:
* 200 - OK - Mã thành công, máy chủ trả về dữ liệu mà người dùng yêu cầu.
* 301 - Moved Permanently - Mã trả về cho thấy địa chỉ web đã được thay đổi vĩnh viễn sang một địa chỉ mới.
* 400 - Bad Request - Mã lỗi báo trong URL chứa những kí tự đặc biệt, ảnh hưởng đến server, hoặc đường dẫn URL và tham số quá dài.
* 403 - Forbidden - Đường dẫn này bị quản trị web chặn truy cập từ bên ngoài.
* 404 - Not Found - Không tìm thấy đường dẫn này.
Có thể xem thêm về các mã lỗi HTTP tại [https://en.wikipedia.org/wiki/List_of_HTTP_status_codes](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes)

### Đường dẫn URL
Đường dẫn API được cung cấp. Ví dụ `https://httpbin.org`, `https://justawordpresssite.com/wp-json`

### Phương thức
Là cách mà dữ liệu được gửi đến API, có thể là GET hoặc POST. Một số dịch vụ API chỉ cung cấp API ở một phương thức nhất định nên bạn hãy chọn một cách thật chính xác, nếu sai sẽ dẫn đến mã lỗi 405.

### Tham số URL
Dùng để gửi dữ liệu cần xử lý đến API endpoint. Ví dụ khi đăng nhập, chúng ta cần gửi 2 tham số là `username` và `password` đến API để nhận kết quả trả về. Bên dưới là hình ví dụ.

![Truyền tham số](http://i.imgur.com/KxWsqvT.png)

Ngoài ra, chúng ta có thể thêm nhiều tham số một cách nhanh chóng bằng cách sử dụng chuỗi tham số như các trình duyệt vẫn gửi về máy chủ. Nhấn vào nút **Thêm từ chuỗi** và nhập chuỗi tham số vào, sau đó ấn nút Thêm bên phải.

Ví dụ có thể thêm nhanh hai tham số như hình trên bằng cách điền `username=admin&password=BbAEwgqFGQ`. Một số ví dụ khác:
* `search=api`
* `id=1&pid=102&catid=12`

Nếu tạm thời không có nhu cầu sử dụng một tham số nào đó, bạn có thể bỏ chọn ở cột Bật, ở hàng tham số mà bạn muốn tạm bỏ đi. Khi cần truyền tham số này, chọn vào ô Bật.

### Cấu hình Header
Tương tự như tham số, tuy nhiên Header sẽ cho server biết một số thông tin về người gửi dữ liệu. Như địa chỉ IP, trình duyệt đang sử dụng (User-Agent), kiểu dữ liệu yêu cầu (Accept). Tận dụng lợi ích này, jAPI cho phép các bạn tùy chỉnh toàn bộ những header mặc định và cả những header tự cấu hình.

Ví dụ, nhờ jAPI, chúng ta có thể thay User-agent từ Windows sang MacOS, Android để kiểm tra giá trị trả về đối với một số API thông dụng. Hơn thế nữa, header mang tên Cookie giúp chúng ta yêu cầu xử lý dữ liệu như một thành viên đang đăng nhập nhờ vào cookie lấy được. Từ đó dữ liệu trả về sẽ chính xác hơn, giúp dò lỗi (debug) dễ dàng hơn.

### Một số tính năng khác
Sau khi đã có dữ liệu là JSON hoặc XML hoặc bất kì được trả về, bạn có thể sử dụng 2 tùy chọn Lưu lại vào một tập tin hoặc Sao chép vào clipboard của máy tính để có thể paste vào các chương trình đang cần dữ liệu này.

Để thuận tiện cho việc sử dụng, các dữ liệu như đường dẫn URL, tham số thêm bằng chuỗi sẽ được lưu lại khi chương trình vẫn còn chạy và chỉ mất đi khi bạn tắt chương trình hoàn toàn.