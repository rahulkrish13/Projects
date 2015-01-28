from flask import Flask, request, make_response 
from flask.ext.sqlalchemy import SQLAlchemy

import json


app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///test.db'
db = SQLAlchemy(app)

#Schema Creation
class User(db.Model): 
	id = db.Column(db.Integer, primary_key=True)
	name = db.Column(db.String(80))	
	email = db.Column(db.String(130), unique=True)
	address = db.Column(db.String(300))
	city = db.Column(db.String(30))
	state = db.Column(db.String(20))
	zip = db.Column(db.Integer)
	phone = db.Column(db.Integer)


	def __init__(self, id , name , email, address, city, state, zip, phone):
		self.id = id
		self.name = name
		self.email = email 
		self.address = address
		self.city = city
		self.state = state
		self.zip = zip
		self.phone = phone

	def __repr__(self):
		return '<User %r>' %self.name

@app.route('/api/entry/', methods=['GET', 'POST'])
def view_func():
	if request.method == 'POST':
		return add_entry(request)
	elif request.method == 'GET':
		return show_entry(request)


def show_entry(request):
	users = User.query.all()
	data = [
		{'id': u.id, 'name': u.name, 'email': u.email, 'address': u.address, 'city':u.city, 'state': u.state, 'zip': u.zip, 'phone no':u.phone} for u in users
	]
	return json.dumps(data)

def add_entry(request):
	print "**************************"#loggers
	data = request.get_data()		#loggers
	dataDict = json.loads(data)		#loggers	
	print "**************************"
	print dataDict['id']			#loggers
	print dataDict['name']			#loggers
	print dataDict['email']			#loggers
	print dataDict['address']		#loggers
	print dataDict['city']			#loggers
	print dataDict['state']			#loggers
	print dataDict['zip']			#loggers
	print dataDict['phone']			#loggers
	print "**************************"
	new_user = User(dataDict['id'],
		             dataDict['name'],
		             dataDict['email'],
		             dataDict['address'],
		             dataDict['city'],
		             dataDict['state'],
		             dataDict['zip'],
		            dataDict['phone'] 
		            )
	db.session.add(new_user)
	db.session.commit()
	print new_user.id
	return json.dumps({'id': new_user.id, 'name': new_user.name, 'email': new_user.email, 'address': new_user.address, 'city': new_user.city, 'state': new_user.state, 'zip': new_user.zip, 'phone no': new_user.phone})

@app.route('/api/entry/<int:id>', methods=['GET', 'PATCH', 'DELETE'])
def entry_detail(id):

	id = int(id)

	if request.method == 'GET':
		entry = User.query.filter_by(id=id).first()
		return json.dumps({'id': entry.id, 'name': entry.name, 'email': entry.email, 'address': entry.address, 'city': entry.city, 'state': entry.state, 'zip': entry.zip, 'phone no': entry.phone})

	elif request.method == 'DELETE':
		entry = User.query.filter_by(id=id).first()
		db.session.delete(entry)
		db.session.commit()
		return '', 204

	elif request.method == "PATCH":
		entry = User.query.filter_by(id = id).first()
		entry.email = get.request_data()
		db.session.commit()


 

if __name__ == '__main__':
	app.run(debug=True)
	db.create_all()
