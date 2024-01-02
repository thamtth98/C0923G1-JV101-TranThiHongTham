drop database if exists book_manage;
create database if not exists book_manage;

use book_manage;

CREATE TABLE book_info (
    id_sach INT PRIMARY KEY AUTO_INCREMENT,
    ma_san_pham VARCHAR(100),
    gia DOUBLE,
    so_luong INT,
    hinh_anh TEXT,
    mo_ta TEXT,
    id_the_loai INT,
    id_tac_gia INT
);
-- 1Trinh thám,
-- 1: Raymond Chandler
-- 2:Higashino Keigo
-- 3:Miyabe Miyuki
-- 4:Higashino Keigo
-- 5:Lượng Lượng

-- 2:Kinh điển
-- 6:Gabriel García Márquez
-- 7:William Shakespeare
-- 8:Alphonse Daudet
-- 9:Vasily Semyonovich Grossman
-- 10:E.B.White
-- 11:Tôn Tử
-- 12:Neil Gaiman , Terry Pratchett

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('KẺ KHÔNG THỂ GIÃ TỪ',480000,30,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/11/14/YQ3QX7I4.jpg','KIỆT TÁC TRINH THÁM ĐƯỢC MURAKAMI ĐÁNH GIÁ RẤT CAO!Một vụ án chưa giải quyết xong, một vụ án khác lại đến.
Ẩn dưới vẻ uể oải thường trực của đời sống giàu có, là những khuôn mặt người như những con búp bê sứ đã vỡ vụn từ lâu nhưng được chắp vá lại bằng sự hào nhoáng đến chán 
chường. Trong Kẻ không thể giã từ, một lần nữa độc giả cùng Philip Marlowe dấn bước vào vụ án càng lúc càng rắc rối, nơi những bóng ma quá khứ trở về để hoàn tất lời từ biệt.
“Tôi dịch những gì tôi thích đọc. Tôi đã dịch tất cả các tiểu thuyết của Raymond Chandler. Tôi thích phong cách của anh ấy rất nhiều. Tôi đã đọc The Long Goodbye năm hoặc sáu lần.”',1,1);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('NỖI NIỀM CỦA THÁM TỬ GALILEO',167000,20,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/9/6/GSEA8MAX.jpg','Một lá thư kỳ quái được gửi đến Sở cảnh sát Tokyo từ kẻ tự xưng "Bàn tay của ác ma" 
cảnh báo về một vụ giết người hàng loạt, đồng thời khiêu khích đích danh phó giáo sư Yukawa Manabu của đại học Teito. 
Mục đích nhắm đến Yukawa của tên tội phạm là gì, cách thức giết người đáng sợ vượt qua hiểu biết thông thường là gì? Yukawa từng tuyên bố sẽ không hợp tác với cảnh sát nay lại phải đương đầu với một vụ án cận kề. 
Cuốn thứ tư trong series Thám tử Galileo khắc họa cuộc quyết đấu giữa tên tội phạm quỷ quyệt và nhà vật lý thiên tài ở một quy mô vượt mọi hình dung.',1,2);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('NGỤY CHỨNG CỦA SOLOMON',267000,10,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/4/18/DRIPI7CD.jpg','Hai người bạn cùng lớp chết không rõ ràng. Giới truyền thông đưa tin đầy thiên kiến. 
Thầy cô bỏ mặc học sinh, tìm mọi cách để lấp liếm và xoa dịu tình hình. Ở thế giới bên kia, Kashiwagi
Takuya đang cất giữ bí mật gì? Khi tất cả còn chìm trong màn sương dối trá mịt mờ, làm sao chúng ta có thể ngang nhiên sống tiếp và tiến về phía trước?
Hãy cùng nhau tìm ra sự thật!
Theo lời kêu gọi của Fujino Ryoko, một “phiên tòa nội bộ trường” đã được lập ra bởi những học sinh đồng chí hướng, với mục đích duy nhất: truy tìm sự thật về cái chết của Kashiwagi Takuya.
Cuộc đọ sức nảy lửa giữa công tố viên và luật sư biện hộ bắt đầu…',1,3);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('PHÍA SAU NGHI CAN X',100000,10,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2019/5/23/ODQ5FV97.jpg','Khi nhấn chuông cửa nhà nghi can chính của một vụ án mới, 
điều tra viên Kusanagi không biết rằng anh sắp phải đương đầu với một thiên tài ẩn dật. 
Kusanagi càng không thể ngờ rằng, chỉ một câu nói vô thưởng vô phạt của anh đã kéo người bạn thân, Manabu Yukawa, 
một phó giáo sư vật lý tài năng, vào vụ án. Và điều làm sững sờ nhất, đó là vụ án kia chẳng qua cũng chỉ như một bài toán cấp ba đơn giản, 
tuy nhiên ấn số X khi được phơi bày ra lại không đem đến hạnh phúc cho bất cứ ai…
Với một giọng văn tỉnh táo và dung dị, Higashino Keigo đã đem đến cho độc giả hơn cả một cuốn tiểu thuyết trinh thám. 
Mô tả tội ác không phải điều hấp dẫn nhất ở đây, mà còn là những giằng xé nội tâm thầm kín, những nhân vật bình dị, và sự quan tâm sâu sa tới con người. 
Tác phẩm đã đem lại cho Higashino Keigo Giải Naoki lần thứ 134, một  giải thưởng văn học lâu đời sánh ngang giải Akutagawa tại Nhật.',1,4);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('THÁM TỬ GÀ MỜ',150000,10,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2017/9/23/8NFI5L2O.jpg','Kết hợp một chút hài hước kiểu Phá án sau bữa tối, 
rắc thêm nguyên liệu rùng rợn của Kindaichi, không quên mượn ông chú thám tử lừng danh lẩm cẩm từ Conan, 
Thám tử gà mờ chính là một nồi lẩu thập cẩm thú vị khiến cuốn người ta vào ngay từ trang đầu tiên, để rồi không thể rời mắt cho tới khi hết trang cuối cùng.',1,5);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('TRĂM NĂM CÔ ĐƠN',199000,35,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/12/7/8MKEH4NK.jpg',
'“Chỉ với một bước nhảy, Gabriel García Márquez đã vụt lên ngang hàng với Günter Grass và Vladimir Nabokov.”
- The New York Times
“Xuất sắc, hỗn độn, với tầm ảnh hưởng lớn ảnh…  Một thiên tiểu thuyết vĩ đại và đầy tính nhạc.”
- The Times',2,6);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ROMEO VÀ JULIET',199000,35,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/9/11/C2HBAGKC.jpg',
'“Virgile đã sáng tạo ra người thiếu phụ yêu đương, Shakespeare đã sáng tạo ra người thiếu nữ yêu đương. Tất cả những thiếu phụ và thiếu nữ yêu đương khác chỉ là mô phỏng theo hai nhân vật Didon và Juliet.”- Flaubert
“Về hai mặt phóng túng và bạo nói, Shakespeare chẳng thua gì Rabelais.”
- Victor Hugo',2,7);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('LÁ THƯ HÈ',146000,35,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/7/18/FJFTJFCV.jpg',
'Chính Alphonse Daudet đã viết: “Đây chính là tác phẩm tôi thích nhất, không phải về phương diện văn chương mà bởi tác phẩm này đã nhắc tôi nhớ những giờ khắc đẹp đẽ nhất của tuổi trẻ, 
những trận cười điên cuồng, những phút say mê không hối tiếc, những bộ mặt, những bóng dáng bạn bè mà sau này tôi không còn gặp lại bao giờ.”
Vậy thì dành thời gian thưởng thức Lá thư hè khác nào một cách ngắn gọn nhất để hiểu về một trong những đại văn hào Pháp, và thêm nữa, 
bồi đắp nỗi hoài nhớ tuổi hoa niên vốn lắng đọng đâu đó trong mỗi con người chúng ta...',2,8);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('CUỘC ĐỜI VÀ SỐ PHẬN',400000,25,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/8/22/DZAS3YZS.jpg',
'Xoay quanh trận Stalingrad, trận chiến mang tính bước ngoặt trong Thế chiến Hai, Cuộc đời và Số phận muốn nắm bắt tinh thần của một thời đại bão tố mà nước Nga trải qua. 
Đó là một bức tranh mênh mông với đông đảo các nhân vật thuộc đủ mọi tầng lớp khiến sự chân thực của bức tranh ấy không chỉ đến những sự kiện lớn lao, 
những anh hùng thời đại quyết định vận mệnh của một dân tộc, mà còn đến từ những tình cảm, suy nghĩ nhỏ nhặt, những bi kịch tinh thần của mỗi cá nhân. 
Bức tranh nước Nga đó phong phú đa diện nhưng đồng thời vẫn hết sức nhất quán nhờ một câu hỏi đầy dằn vặt không ngừng trở đi trở lại: 
Làm thế nào con người có thể kháng cự quá trình phi nhân hóa, làm thế nào để có thể vừa sống sót vừa giữ được tính người trong cơn bão tố của lịch sử?',2,9);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('TIẾNG KÈN THIÊN NGA',10000,35,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2023/8/22/M4COSLFE.jpg',
'“Thiên nga thì phải vui tươi, không buồn bã; phong nhã, không vụng về; can trường, không hèn nhát.” 
Và nếu là thiên nga kèn, thì còn phải biết cất tiếng kêu tuýt! tuýt! thật mạnh mẽ, âm vang.
Trớ trêu thay, thiên nga kèn Louis lại không thể kêu tuýt! tuýt!, hay chíp!chíp!, hay phát ra bất kỳ âm thanh nào. 
Nhưng cũng may mắn làm sao, chú có một người mẹ nhạy cảm và thấu hiểu, một người cha sẵn sàng hy sinh cả tính mạng để tìm cho con trai mình một giọng nói. 
Và thêm ngàn lần may mắn, chú chính là… Louis, một thiên nga thông minh, nghị lực và đầy phẩm giá. Có hề gì nếu chú không thể cất tiếng kêu như đồng loại cơ chứ? 
Bởi giờ đây, bằng thứ âm nhạc truyền cảm phát ra từ cây kèn trumpet, thiên nga Louis giao tiếp với cả thế giới.',2,10);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('TÔN TỬ BINH PHÁP',89000,29,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2019/6/28/QGRGE9EW.jpg',
'Được xưng tụng là tuyệt tác binh thư hàng đầu của thế giới cổ đại, binh thư kinh điển vĩ đại nhất trong lịch sử nhân loại, Tôn Tử binh pháp là một cuốn cổ thư “kỳ quái”, 
“để trong vườn sẽ tỏa mùi thơm của hoa quý, ném xuống đất sẽ vang tiếng kêu của bạc vàng”. Nó không chỉ được các vua chúa từ đông sang tây xem như sách gối đầu giường, 
bí kíp quân sự không thể thiếu, mà còn được nhiều chuyên gia trong các lĩnh vực như triết học, kinh doanh, tâm lý học, ngôn ngữ học, thể dục thể thao…
ứng dụng để nghiên cứu và đạt được nhiều thành tựu đáng kể.
Tôn Tử binh pháp với văn từ gọn ghẽ, nghĩa lý sâu xa, âm điệu bay bổng, nhờ đó sức lan tỏa và tầm ảnh hưởng của 
“thánh điển binh học” này vô cùng rộng lớn, được dịch ra trên 100 thứ tiếng và xuất bản hầu khắp trên toàn thế giới. ',2,11);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ĐIỀM LÀNH - NHỮNG LỜI TIÊN TRI TUYỆT ĐÍCH VÀ CHUẨN XÁC CỦA PHÙ THỦY AGNES NUTTER',220000,40,'http://static.nhanam.com.vn/thumb/0x320/crop/Books/Images/2022/12/13/V5VL3E5N.jpg',
'Quỷ Crowley và thiên thần Aziraphale biết rằng Tận Thế sắp sửa đến với thế giới này, với sự giáng lâm của Kẻ Chống Chúa trong hình hài đứa trẻ sơ sinh. 
Đáng lẽ cả hai phải lấy làm sung suớng: cuộc chiến tối hậu giữa thiên đường và địa ngục, dù phe nào thắng, thì cũng sẽ hủy diệt thế giới này, 
kết thúc cuộc giằng co hàng thiên niên kỷ giữa Thiện và Ác. Nhưng khốn nỗi, cả Crowley và Aziraphale lại thấy nuối tiếc thế giới của nhân loại. 
Thế giới con người vừa nhếch nhác, ngu xuẩn, lại vừa độc địa, thế nhưng nó cũng thú vị ghê gớm, 
đến nổi viễn cảnh phải sống ở một nơi toàn địa ngục hay toàn thiên đường trở nên không thể chịu đựng nổi với cả hai. 
Thiên thần và ác quỷ cùng tham gia vào một mưu đồ vừa khôn ngoan, vừa dớ dẩn, để cứu thế giới khỏi họa diệt vong.',2,12);
