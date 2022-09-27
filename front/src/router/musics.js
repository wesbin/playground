export default [
  {
    path: '/music',
    name: 'Music',
    component: () => import('@/components/main/Music'),
  },
  {
    path: '/music/:musicId/info',
    name: 'MusicInfo',
    component: () => import('@/components/post/music/MusicInfo'),
    props: true,
  },
]