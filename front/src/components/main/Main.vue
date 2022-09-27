<script setup>
import Board from '@/components/board/Board';
import axios from 'axios';
import {onBeforeMount, reactive} from 'vue';
import {useRouter} from 'vue-router';

const router = useRouter();
const recentViewComics = reactive({
  name: '만화',
  posts: [],
  onPostClicked: (post) => router.push({
    name: 'ComicView',
    params: {
      comicId: post.comicId,
      episode: post.recentViewEpisode
    }
  })
})

const recentViewMusics = reactive({
  name: '음악',
  posts: [],
  onPostClicked: (post) => router.push({
    name: 'MusicInfo',
    params: {
      musicId: post.musicId,
    }
  })
})

onBeforeMount(() => {
  // 최근 만화
  axios.get('http://localhost:8081/comics/recent/view')
      .then(({ data }) => recentViewComics.posts = data)

  // todo tab 을 눌렀을 때 데이터를 가져오는게 좋지 않겠나?
  // 최근 음악
  axios.get('http://localhost:8081/musics/recent/view')
      .then(({ data }) => recentViewMusics.posts = data)
})
</script>

<template>
  <main class="main">
    <section class="board-section">
      <!-- todo relatedMenu? -->
      <!-- todo 여기에서는 본게 몇 화인지 보여야 됨 만화의 경우 근데 또 음악은 그게 없음 => Factory Pattern 따위로 분기처리 해줘야 할듯 -->
      <Board :tabs="[recentViewComics, recentViewMusics]"></Board>
    </section>
    <section class="board-section">
      <!-- todo Board 한줄과 두줄 ThumbnailPost 크기 처리 -->
<!--      <Board :tabs="recentViewBoard"></Board>-->
<!--      <Board :tabs="recentViewBoard"></Board>-->
    </section>
  </main>
</template>

<style scoped lang="scss">
.main {
  width: 1150px;

  .board-section {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(0, 1fr));
    gap: 30px;

    .article {
      height: 300px;
      background-color: bisque;
    }
  }
}
</style>