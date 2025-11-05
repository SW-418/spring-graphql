from flask import Flask, jsonify, request

app = Flask(__name__)

# In-memory data store
artists = [
    {"id": "ae4b1ae8-c2dc-4bfc-bbfb-9082d3611583", "name": "Mild Minds"},
    {"id": "818bb185-fdff-4206-870b-db3fd0f8e67a", "name": "Drake"},
    {"id": "5c0694f9-3fa0-43be-adbc-4db8368839e1", "name": "ATRIP"}
]

@app.route("/artists", methods=["GET"])
def get_artists():
    return jsonify(artists)

@app.route("/artists/<string:artist_id>", methods=["GET"])
def get_artist(artist_id):
    artist = next((u for u in artists if u["id"] == artist_id), None)
    if not artist:
        return jsonify({"error": "Artist not found"}), 404
    return jsonify(artist)

if __name__ == "__main__":
    app.run(debug=True)
