//4.1
var util = {};

util.requestSync = function(url, param, method, callback) {
	$.ajax({
		url : url,
		method : method,
		dataType : "JSON",
		data : param,
		error : function() {
			alert('error');
		},
		success : callback
	});
}

var contextRoot = "/zstudy2";
// 4.2
// 공통 콤보박스
// Parameter : id, code, value, select, onChange
// id : combo의 id와 name의 값
// code : 공통코드의 그룹코드
// value : 기본 선택값
// select : 전체에 해당하는 '-select-'표시 유무 Y/N
// service : servlet을 실행할 경우 service
util.initSelectBox = function(id, groupCode, value, select, service) {

	if (groupCode == null)
		return;
	var reqData = {
		upcd : groupCode
	};
	var serv = contextRoot + "/common/getCodeList.html"; // 경로 주의
	// 서비스가 있을경우 공통코드가 아닌 서비스로 값 조회
	if (service)
		serv = service;
	util.requestSync(serv, reqData, 'POST', function(data) {

		var obj = $('#' + id).get(0);
		obj.options.length = 0;
		if (select == "Y")
			obj.add(new Option("-select-", ""));
		for (var i = 0; i < data.codeList.length; i++) {
			var item = data.codeList[i];
			if (item.CODE == value) { // item의 CODE, VALUE가 HashMap의 키와 대소문자가 일치해야함.
				obj.add(new Option(item.VALUE, item.CODE, true, true));
			} else {
				obj.add(new Option(item.VALUE, item.CODE));
			}
		}
	});
};
