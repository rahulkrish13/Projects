x=1; for i in *jpg; do counter=$(printf %03d $x); ln -s "$i" ./img"$counter".jpg; x=$(($x+1)); done
sleep 5s
ffmpeg -f image2 -i ./img%03d.jpg ./a.mpg
sleep 5s
cat *.jpg | ffmpeg -f image2pipe -c:v mjpeg -i - output.mpg
sleep 10s
rm -rf *.jpg
rm -rf a.mpg