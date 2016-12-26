<%@ taglib uri="/WEB-INF/lib/spring-form.tld" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Researcher Homepage</title>

<!-- Latest compiled CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" />

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>


<script type="text/javascript">

$('#myModal').on('show', function() {
    var tit = $('.confirm-delete').data('title');

    $('#myModal .modal-body p').html("Desea eliminar al usuario " + '<b>' + tit +'</b>' + ' ?');
    var id = $(this).data('id'),
    removeBtn = $(this).find('.danger');
})

$('.confirm-delete').on('click', function(e) {
    e.preventDefault();

    var id = $(this).data('id');
    $('#myModal').data('id', id).modal('show');
});

$('#btnYes').click(function() {
    // handle deletion here
    var id = $('#myModal').data('id');
    $('[data-id='+id+']').parents('tr').remove();
    $('#myModal').modal('hide');
    
});

</script>

</head>

<body>

          <div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                  <div class="modal-header">
                       <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                            <h3 id="myModalLabel">Delete</h3>
                        
                   </div>
                        <div class="modal-body">
                            <p></p>
                        </div>
                        <div class="modal-footer">
                            <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
                            <button data-dismiss="modal" class="btn red" id="btnYes">Confirm</button>
                        </div>
   		</div><table class="table table-striped table-hover table-users">
    			<thead>
    				<tr>
    					
    					<th class="hidden-phone">Usuario</th>
    					<th>Nombre</th>
    					<th>Apellido</th>
    					<th class="hidden-phone">Email</th>
    					<th class="hidden-phone">Provincia</th>
    					<th class="hidden-phone">Miembro desde</th>
    					<th>Estado</th>
    					<th></th>
    					<th></th>
    				</tr>
    			</thead>

    			<tbody>
    				
    				<tr>
                        
    					<td class="hidden-phone">johnny</td>
    					<td>john</td>
    					<td>doe</td>
    					<td class="hidden-phone">dsd@gmail.com</td>
    					<td class="hidden-phone">active</td>
                      <td class="hidden-phone">10/12/1999</td>
    					   					
                    	<td><span class="label label-warning">Not Active</span></td>
                    	  					
    					<td><a class="btn mini blue-stripe" href="{site_url()}admin/editFront/1">Edit</a></td>

                        <td><a href="#" class="confirm-delete btn mini red-stripe" role="button" data-title="johnny" data-id="1">Delete</a></td>
                    </tr>
					<tr>
                        
    					<td class="hidden-phone">kitty</td>
    					<td>jane</td>
    					<td>doe</td>
    					<td class="hidden-phone">dasasasd@gmail.com</td>
    					<td class="hidden-phone">active</td>
                      <td class="hidden-phone">10/1/1999</td>
    					   					
                    	<td><span class="label label-danger">Activo</span></td>
                    	  					
    					<td><a class="btn mini blue-stripe" href="{site_url()}admin/editFront/2">Edit</a></td>

                        <td><a href="#" class="confirm-delete btn mini red-stripe" role="button" data-title="kitty" data-id="2">Delete</a></td>
                    </tr>
                
	               </tbody>

    		</table>

</body>
</html>